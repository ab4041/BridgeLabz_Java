/*
Question:
Check Harshad number and digit frequency.

Hint =>
Harshad = number divisible by sum of digits
Use 2D array for digit frequency
*/

class NumberCheckerExtended {

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = NumberChecker.getDigits(number);

        System.out.println("Harshad: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        for (int[] f : freq)
            if (f[1] > 0) System.out.println(f[0] + " -> " + f[1]);
    }
}
