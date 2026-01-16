/*
Question:
Write a program SpringSeason that checks if a given month and day
fall under Spring Season.

Spring Season: March 20 to June 20
*/

class SpringSeason {

    public static void main(String[] args) {

        // Read month and day from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check spring season condition
        boolean isSpring =
            (month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20);

        // Print result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
