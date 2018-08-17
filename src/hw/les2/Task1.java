package hw.les2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();


        boolean temporal = isTemporal(year);
        if (temporal) {
            System.out.println(year + " високостный");
        } else {
            System.out.println(year + " не високостный");
        }

        if (isDateValid(day, month, year)) {
            System.out.println(day + "." + month + "." + year);
            System.out.println("Дата введена корректно");
        } else {
            if (isDateInvalid(day, month, year)) {
                if (month > 12 || month <= 0 || year <= 0)
                    System.out.println("Дата введена некорректно.");
            }
        }
    }


    private static boolean isTemporal(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isDateInvalid(int day, int month, int year) {
        if (day == 0 && day > 31) {
            return false;
        }
        if (month == 0 && month > 12) {
            return false;
        }
        if (year == 0 && year > 2018) {
            return false;
        }
        return false;
    }

    private static boolean isDateValid(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day == 31;
            case 2:
                if (isTemporal(year)) {
                    return day == 29;
                } else {
                    return day == 28;
                }
        }
        return false;
    }
}
