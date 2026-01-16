/*
Question:
Take input marks of students in Physics, Chemistry, Maths.
Calculate total, average and percentage.

Hint =>
Use 2D arrays
Round values to 2 digits
*/

class StudentScorecard {

    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    public static void main(String[] args) {

        int students = 5;
        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");
        for (int i = 0; i < students; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2]
                    + "\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }
}
