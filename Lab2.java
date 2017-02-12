package lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        boolean playAgain = true;

        while (playAgain != false) {
            Scanner scnr = new Scanner(System.in);
            int userInput = 0;
            char answer = '-';
            String input = "";

            System.out.println("Enter a number between 1 and 100: ");
            userInput = scnr.nextInt();

            if (userInput % 2 != 0) {

                System.out.println(userInput + " is odd.");

            } else if ((userInput % 2 == 0) && (userInput < 25)) {
                System.out.println("Even and less than 25.");

            } else if ((userInput % 2 == 0) && (userInput >= 26) && (userInput <= 60)) {
                System.out.println("Even");

            } else if ((userInput % 2 == 0) && (userInput > 60)) {
                System.out.println("Even");

            } else if ((userInput % 2 != 0) && (userInput > 60)) {
                System.out.println("Odd");
            } else {
                System.out.println("ERROR");
            }

            System.out.print("Continue?(y/n)");

            input = scnr.next();
            answer = input.charAt(0);

            if ((answer == 'Y') || (answer == 'y')) {
                playAgain = true; // this will take us back to the start

            } else if ((answer == 'N') || (answer == 'n')) {
                playAgain = false;
            }
        }
        System.out.print("Goodbye");
    }
}
