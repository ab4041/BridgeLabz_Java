/*
Question:
Check palindrome using digits array.
*/

class PalindromeChecker {

    public static int[] reverse(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = NumberChecker.getDigits(number);
        return areEqual(digits, reverse(digits));
    }

    public static void main(String[] args) {
        System.out.println("Palindrome: " + isPalindrome(121));
    }
}
