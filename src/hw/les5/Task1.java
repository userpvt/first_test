package hw.les5;

public class Task1 {
    public static void main(String[] args) {
        String string = "ze45ro  or54ez";
        System.out.println(string);
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        boolean result = true;
        String newString = string.toLowerCase();
        int lengthOfNewString = newString.length();
        if (lengthOfNewString == 0) {
            result = false;
        }
        for (int i = 0; i < lengthOfNewString / 2; i++) {
            if (newString.charAt(i) != newString.charAt(lengthOfNewString - 1 - i)) {
                result = false;
            }
        }
        return result;
    }
}


