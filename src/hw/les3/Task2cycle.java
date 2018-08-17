package hw.les3;

import java.util.Scanner;

public class Task2cycle {
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
            calculateAndPrintFibonacciNumbers(number);
        }
    }

    private static void calculateAndPrintFibonacciNumbers(int number) {
        int previous = 0;
        int current = 1;
        int next;
        System.out.printf("%d %d ", previous, current);
        for (; current < number; ) {
            next = current + previous;
            if (next < number) {
                System.out.printf("%d ", next);
            } else {
                break;
            }
            previous = current;
            current = next;
        }
    }
}
