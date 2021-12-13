import java.awt.desktop.SystemEventListener;
import java.util.Random;
import java.util.Scanner;

public class MYTASK {

    public static void main(String[] args) {
        System.out.println("-------------ROCK PAPER SCISSOR-------------- ");
        System.out.println("---------------------------------------------");
        System.out.println("----------------Let's Start!!----------------");
        int computerScore = 0;
        int userScore = 0;
        while (computerScore < 5 && userScore < 5) {
            Random r = new Random();
            int random = r.nextInt(3) + 1;
            String computerChoice = "";
            String userChoice = "";
            switch (random) {
                case 1:
                    computerChoice = "Rock";
                    break;
                case 2:
                    computerChoice = "Paper";
                    break;
                case 3:
                    computerChoice = "Scissor";
                    break;
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Rock    = 1");
            System.out.println("Paper   = 2");
            System.out.println("Scissor = 3");
            System.out.println("Your choice == ");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    userChoice = "Rock";
                    break;
                case 2:
                    userChoice = "Paper";
                    break;
                case 3:
                    userChoice = "Scissor";
                    break;
            }
            System.out.println("User choice : " + userChoice);

            if (computerChoice.equals("Rock")) {
                if (userChoice.equals("Rock")) {
                    System.out.println("Deuce");
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);
                } else if (userChoice.equals("Paper")) {
                    System.out.println("You won.");
                    userScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);

                } else {
                    //userChoice = scissor
                    System.out.println("Computer won");
                    computerScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);

                }

            } else if (computerChoice.equals("Paper")) {
                if (userChoice.equals("Rock")) {
                    System.out.println("Computer won");
                    computerScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);


                } else if (userChoice.equals("Paper")) {
                    System.out.println("Deuce");
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);


                } else {
                    //userChoice = scissor
                    System.out.println("You won.");
                    userScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);

                }

            } else {
                //computerChoice = scissor
                if (userChoice.equals("Rock")) {
                    System.out.println("You won");
                    userScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);


                } else if (userChoice.equals("Paper")) {
                    System.out.println("Computer won");
                    computerScore++;
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);


                } else {
                    //userChoice = scissor
                    System.out.println("Deuce");
                    System.out.println("Your Score == " + userScore + " || " + "Computer Score = " + computerScore);

                }
            }
            System.out.println("Computer choice was " + computerChoice);
            System.out.println("***************************");
        }
        if (userScore > computerScore) {
            System.out.println(("Game Over"));
            System.out.println("Congratulations!");
            System.out.println("You won!!");
        } else {
            System.out.println("Game Over");
            System.out.println("Sorry :(");
            System.out.println("You Lost");
        }
    }
}
