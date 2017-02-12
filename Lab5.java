package lab5;

import java.util.Random;
import java.util.Scanner;

public class Lab5 {

    public static int rollDice(int roll1) {

        Random rand = new Random();

        int output = rand.nextInt(roll1 + 1);

        return output;

    }

    public static boolean continueGame() {

        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        char answer = '-';
       
         System.out.println("Do you wish to continue?: y/n");
        
        userInput = scnr.next();
        answer = userInput.charAt(0);

        if ((answer == 'Y') || (answer == 'y')) {
            return true;

        } else if ((answer == 'N') || (answer == 'n')) {
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) { //play again loop

            System.out.println("Welcome to the Grand Circus Casino!");
            System.out.println();

            System.out.println("How many sides should each die have?");

            int input1 = scnr.nextInt();

            System.out.println("Roll 1:");

            System.out.println(rollDice(input1));
            System.out.println(rollDice(input1));

            playAgain = continueGame();
            }
        System.out.print("Goodbye");
    }
}
