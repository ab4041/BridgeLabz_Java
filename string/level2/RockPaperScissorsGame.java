/*
Question:
Rock-Paper-Scissors game with statistics.
*/

import java.util.Scanner;

class RockPaperScissorsGame {

    public static String computerChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0;

        int games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();

            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
        sc.close();
    }
}
