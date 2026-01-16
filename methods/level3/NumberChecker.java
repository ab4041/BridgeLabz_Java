/*
Question:
Extend or Create a NumberChecker utility class.

Hint =>
Count digits, store digits, Duck number, Armstrong number,
largest & second largest, smallest & second smallest
*/

class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) { count++; number /= 10; }
        return count;
    }

    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0, power = digits.length;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == number;
    }

    public static int[] largestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) { second = first; first = d; }
            else if (d > second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static int[] smallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) { second = first; first = d; }
            else if (d < second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Duck: " + isDuckNumber(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));

        int[] big = largestTwo(digits);
        int[] small = smallestTwo(digits);

        System.out.println("Largest: " + big[0] + ", Second: " + big[1]);
        System.out.println("Smallest: " + small[0] + ", Second: " + small[1]);
    }
}
