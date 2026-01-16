/*
Question:
Create a program to find the shortest, tallest, and mean height of players present in a football team.

Hint =>
mean = sum of all elements / number of elements
Create an int array named heights of size 11
Generate random height between 150 and 250
*/

class FootballTeamHeight {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int sum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    public static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
    }
}
