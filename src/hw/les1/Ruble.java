package hw.les1;

import java.util.Scanner;

public class Ruble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        int rubles = scanner.nextInt();

        int lastDigit = rubles % 10;
        int lastDigits = rubles % 100;
        if ((5 <= lastDigit && lastDigit <= 9 || lastDigit == 0 || 11 <= lastDigits && lastDigits <= 19)) {
            System.out.println(rubles + " рублей");

        } else if (2 <= lastDigit && lastDigit <= 4) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рубль");
        }
    }
}
