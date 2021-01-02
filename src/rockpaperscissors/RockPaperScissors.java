package rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean end = false;
        int playerScore = 0;
        int compScore = 0;
        while (end == false) {
            boolean loop = true;
            while (loop == true) {
                loop = false;
                System.out.println("Rock, paper or scissors? ( If you would like to exit the game, type end) \n");
                String playerAnswer = in.nextLine();
                int compNum = rand.nextInt(2);
                String compAnswer = "chungusWait";
                boolean willGrenade = false;
                switch (compNum) {
                    case 0:
                        compAnswer = "Rock";
                        break;
                    case 1:
                        compAnswer = "Paper";
                        break;
                    case 2:
                        compAnswer = "Scissors";
                        break;
                }
                int nowGrenade = rand.nextInt(100);
              
                if (nowGrenade == 65 && playerScore != 0) {
                    System.out.println("Oh no! Computer chose grenade! Either you or the computer will be reset!");
                    int reset = rand.nextInt(1);
                    switch (reset) {
                        case 0:
                            System.out.println("Oh no! You boomed! Your score has been reset to 0");
                            playerScore = 0;
                            break;
                        case 1:
                            System.out.println("Oh no! Computer boomed! Computer's score has been set to 0");
                            compScore = 0;
                            break;
                    }

                } else {
                    if (playerAnswer.equalsIgnoreCase(compAnswer)) {
                        System.out.println("You both chose " + playerAnswer + ", please try again.");
                    } else if (playerAnswer.equalsIgnoreCase("Rock")) {
                        if (compAnswer.equals("Paper")) {
                            System.out.println("Computer wins! You chose Rock and computer chose Paper");
                            compScore++;

                        } else if (compAnswer.equals("Scissors")) {
                            System.out.println("Player wins! You chose Rock and Computer chose Scissors");
                            playerScore++;
                        }
                    } else if (playerAnswer.equalsIgnoreCase("Paper")) {
                        if (compAnswer.equals("Scissors")) {
                            System.out.println("Computer wins! You chose Paper and computer chose Scissors");
                            compScore++;

                        } else if (compAnswer.equals("Rock")) {
                            System.out.println("Player wins! You chose Paper and Computer chose Rock");
                            playerScore++;
                        }
                    } else if (playerAnswer.equalsIgnoreCase("Scissors")) {
                        if (compAnswer.equals("Paper")) {
                            System.out.println("Player wins! You chose Scissors and computer chose Paper");
                            playerScore++;

                        } else if (compAnswer.equals("Rock")) {
                            System.out.println("Computer wins! You chose Scissors and Computer chose Rock");
                            compScore++;
                        }
                    } else if (playerAnswer.equalsIgnoreCase("grenade")) {
                        System.out.println("Oh no! You chose grenade! Either you or the computer will be reset!");
                        int reset = rand.nextInt(1);
                        switch (reset) {
                            case 0:
                                System.out.println("Oh no! You boomed! Your score has been reset to 0");
                                playerScore = 0;
                                break;
                            case 1:
                                System.out.println("Oh no! Computer boomed! Computer's score has been set to 0");
                                compScore = 0;
                                break;
                        }
                    } else if (playerAnswer.equalsIgnoreCase("end")) {
                        end = true;
                    } else {
                        System.out.println("I'm sorry, that is not a valid choice, please retry");
                        loop = true;
                    }
                }
            }
        }
        System.out.println("Player score is "+playerScore+" and Computer score is "+compScore);
    }

}
