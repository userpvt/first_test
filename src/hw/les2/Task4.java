package hw.les2;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int discriminant = b * b - 4 * a * c;
        if (isPositive(discriminant)) {
            double sqrt = Math.sqrt(discriminant);
            System.out.println("x1 = " + sqrt);
            System.out.println("x2 = " + -sqrt);
        } else if (isZero(discriminant)) {
            System.out.println("x = " + discriminant);
        } else {
            System.out.println("Корней нет " + discriminant);
        }
    }

    private static boolean isPositive(int value) {
        return value > 0;
    }

    private static boolean isZero(int value) {
        return value == 0;
    }
}
