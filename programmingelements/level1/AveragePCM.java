/*
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
*/

// Class to compute average percentage in PCM
class AveragePCM {

    public static void main(String[] args) {

        // Declare subject marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Total and average calculation
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double averageMarks = totalMarks / 3.0;

        // Display output
        System.out.println("Sam’s average mark in PCM is " + averageMarks);
    }
}
