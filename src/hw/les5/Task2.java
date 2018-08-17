package hw.les5;

public class Task2 {
    public static void main(String[] args) {
        char[] romanSimvol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabNumber = {1, 5, 10, 50, 100, 500, 1000};
        String string = "MCCVXLCI";

        System.out.println(translateRomanToArabic(romanSimvol, arabNumber, string));
    }

    private static int translateRomanToArabic(char[] romanSimvol, int[] arabNumber, String string) {
        StringBuilder builder = new StringBuilder(string);
        int result = 0;
        int i = 0;
        while (i < (builder.length() - 1)) {
            int currentCharRank = 0;
            for (int j = 0; j < romanSimvol.length; j++) {
                if (builder.charAt(i) == romanSimvol[j]) {
                    currentCharRank = j;
                    break;
                }
            }
            int nextCharRank = 0;
            for (int j = 0; j < romanSimvol.length; j++) {
                if (builder.charAt(i + 1) == romanSimvol[j]) {
                    nextCharRank = j;
                    break;
                }
            }
            if (currentCharRank < nextCharRank) {
                result = result - arabNumber[currentCharRank] + arabNumber[nextCharRank];
                builder.delete(i, i + 2);
                continue;
            }
            i = i + 1;
        }
        for (int k = 0; k < builder.length(); k++) {
            for (int j = 0; j < romanSimvol.length; j++) {
                if (builder.charAt(k) == romanSimvol[j]) {
                    result = result + arabNumber[j];
                    break;
                }
            }
        }
        return result;
    }
}
