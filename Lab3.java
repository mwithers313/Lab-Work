package lab3;

import java.util.Scanner;


public class Lab3 {

    public static String fixedLengthString(String string, int length) {
        return String.format("%1$" + length + "s", string);
    }

    public static void main(String[] args) {

        boolean playAgain = true;

        while (playAgain != false) {

            Scanner scnr = new Scanner(System.in);

            int input = 0;
            String userInput = "";
            char answer = '-';
            int length = 5;
            
            System.out.println("Learn your squares and cubes!");
            System.out.println();
            System.out.print("Enter an integer: ");

            input = scnr.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "   " + "======");

            for (int i = 1; i <= input; i++) {

                int numberSquared = (int) Math.pow(i, 2);

                int numberCubed = (int) Math.pow(i, 3);

                System.out.println("  "+fixedLengthString(i+"", length)+"  "+fixedLengthString(numberSquared+"", length)+"    "+fixedLengthString(numberCubed+"", length));
                
            }

                System.out.print("Do you want to play again? (y/n)");

                userInput = scnr.next();
                answer = userInput.charAt(0);

                if ((answer == 'Y') || (answer == 'y')) {
                    playAgain = true; // this will take us back to the start

                } else if ((answer == 'N') || (answer == 'n')) {
                    playAgain = false;
                }
            }
            System.out.print("Goodbye");
        }
    }
