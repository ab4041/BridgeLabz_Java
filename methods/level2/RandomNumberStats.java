/*
Question:
Write a program that generates five 4 digit random values and then finds
their average, minimum and maximum.

Hint =>
Use Math.random(), Math.min(), Math.max()
*/

class RandomNumberStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        double[] result = findAverageMinMax(numbers);

        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
