package hw.les4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] firstValues = {1, 2, 3, 4, 5};
        int[] secondValues = {5, 6, 7};
        int[] result = new int[firstValues.length + secondValues.length];
        System.out.println(Arrays.toString(result));
        test(firstValues, secondValues, result);
        System.out.println(Arrays.toString(result));
    }


    private static void test(int[] firstValues, int[] secondValues, int[] result) {
        int i = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        try {
            while (i < result.length) {
                if (firstIndex < firstValues.length) {
                    result[i++] = firstValues[firstIndex++];
                }
                if (secondIndex < secondValues.length) {
                    result[i++] = secondValues[secondIndex++];
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
