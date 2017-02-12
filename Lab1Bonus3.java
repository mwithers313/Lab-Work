package lab1bonus3;

import java.util.Scanner;
import java.util.Random;

public class Lab1Bonus3 {

    public static void main(String[] args) {

        boolean playAgain = true; // for "play again(y/n)" farthest outside loop

        while (playAgain == true) { // start of farthest outer loop

            Scanner scnr = new Scanner(System.in);
            Random rand = new Random();
            int guess = 0; //user guess
            int pickedNumber = rand.nextInt(100); //random number 
            boolean win = false; //for inner loop
            int numberOfTrys = 0; //attempt counter
            String userInput = "";
            char answer = '-';//varible for answer to "(y/n)?" 

            System.out.println("Welcome to the Guess a Number Game!");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (win == false) { //start of inner loop
                System.out.print("User guess: ");

                guess = scnr.nextInt();
                numberOfTrys++;

                if (guess == pickedNumber) {
                    win = true;
                } else if (guess <= (pickedNumber - 10)) {
                    System.out.println("Way too low!");
                } else if (guess >= (pickedNumber + 10)) {
                    System.out.println("Way too high!");
                } else if (guess >= (pickedNumber - 9) && (guess < pickedNumber)) {
                    System.out.println("Too low!");
                } else if (guess <= (pickedNumber + 9) && (guess > pickedNumber)) {
                    System.out.println("Too high!");
                }
            }// end of inner loop
            System.out.println("You win!");
            System.out.println("It took you " + numberOfTrys + " attempts");

            System.out.print("Continue?(y/n)");

            userInput = scnr.next();
            answer = userInput.charAt(0);

            while ((answer != 'N') && (answer != 'n') && (answer != 'Y') && (answer != 'y')) {//start or error loop
                System.out.println("ERROR: Please try again: (y/n)");

                userInput = scnr.next();
                answer = userInput.charAt(0);
            }//end of error loop
            
            if ((answer == 'Y') || (answer == 'y')) {
                playAgain = true; // this will take us back to the start

            } else if ((answer == 'N') || (answer == 'n')) {
                playAgain = false;
            }
        }//end of outer loop
        System.out.print("Goodbye");
    }
}
