package lab4;

import java.util.Scanner;

public class Lab4 {

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

        boolean playAgain = true;
        while (playAgain) {
            int input = 0;
            int i = 0;
            int answer = 1;

            System.out.println("Enter an integer that's greater than 0 but less than 10:");
            Scanner scnr = new Scanner(System.in);

            input = scnr.nextInt();

            for (i = 1; i <= input; i++) {
                answer = answer * i;
            }

            System.out.println("The factorial of " + input + " is = " + answer);
        }
        playAgain = continueGame();
    }

}

