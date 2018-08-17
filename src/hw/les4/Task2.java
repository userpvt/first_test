package hw.les4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 2, 4, 4, 5, 6, 4, 2, 9};

        int sumOfElements = getSumOfElements(values);
        System.out.println(sumOfElements);
        deleteDuplicates(values);
        System.out.println(Arrays.toString(values));
    }

    private static int getSumOfElements(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    private static void deleteDuplicates(int[] values) {
        boolean equal = false;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                equal = values[i] == values[j];
                if (equal) {
                    values[j] = 0;
                } else if (values[i] > values[j]) {
                    System.out.println("i больше j");
                } else {
                    System.out.println("i меньше j");
                }
            }
        }
    }

    private static boolean isEqual(int first, int second) {
        return first == second;
    }
}



