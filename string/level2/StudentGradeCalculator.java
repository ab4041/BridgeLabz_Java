/*
Question:
Generate PCM marks, calculate percentage and grade.
*/

class StudentGradeCalculator {

    public static int[][] generatePCM(int students) {

        int[][] pcm = new int[students][3];

        for (int i = 0; i < students; i++) {
            pcm[i][0] = (int)(Math.random() * 50) + 50;
            pcm[i][1] = (int)(Math.random() * 50) + 50;
            pcm[i][2] = (int)(Math.random() * 50) + 50;
        }
        return pcm;
    }

    public static char calculateGrade(double percent) {

        if (percent >= 90) return 'A';
        if (percent >= 75) return 'B';
        if (percent >= 60) return 'C';
        return 'D';
    }

    public static void main(String[] args) {

        int[][] pcm = generatePCM(5);

        System.out.println("P C M Total % Grade");

        for (int i = 0; i < pcm.length; i++) {

            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double percent = Math.round((total / 3.0) * 100.0) / 100.0;
            char grade = calculateGrade(percent);

            System.out.println(pcm[i][0] + " " + pcm[i][1] + " " + pcm[i][2]
                    + " " + total + " " + percent + " " + grade);
        }
    }
}
