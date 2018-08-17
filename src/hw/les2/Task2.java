package hw.les2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("размер дома a:");
        int a = scanner.nextInt();

        System.out.println("размер дома b:");
        int b = scanner.nextInt();

        System.out.println("размер дома c:");
        int c = scanner.nextInt();

        System.out.println("размер дома d:");
        int d = scanner.nextInt();

        System.out.println("размер участка e: 20");
        int e = 20;

        System.out.println("размер участка f: 20");
        int f = 20;

        int maxSideOfHouses = Math.max(Math.max(a, b), Math.max(c, d));
        int maxSideOfArea = Math.max(e, f);
        if (maxSideOfArea < maxSideOfHouses) {
            System.out.println("ne verno");
        } else {
            int sumOfMinSides = Math.min(a, b) + Math.min(c, d);
            if (sumOfMinSides > Math.min(e, f)) {
                System.out.println("ne verno");
            } else {
                System.out.println("vse verno");
            }
        }
    }
}
