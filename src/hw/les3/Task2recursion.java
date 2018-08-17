package hw.les3;

import java.util.Scanner;

public class Task2recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Числа Фибоначии: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610");
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.print(number);
        } else if (number < 0) {
            System.out.printf("Сумма чисел Фибоначи не может быть %d", number);
        } else {
            int previous = 0;
            int current = 1;
            System.out.printf("%d %d ", previous, current);
            calculateAndPrintFibonacciNumbers(previous, current, number);
        }
    }

    private static void calculateAndPrintFibonacciNumbers(int previous, int current, int number) {
        int next = previous + current;
        if (next >= number) {
            return;
        }
        System.out.printf("%d ", next);

        previous = current;
        current = next;
        calculateAndPrintFibonacciNumbers(previous, current, number);
    }
}
