package lab8;

import java.util.Scanner;

public class Lab8 {

    public static boolean continueGame() {

        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        char answer = '-';

        System.out.println("Another Batter?: y/n");

        userInput = scnr.next();
        answer = userInput.charAt(0);

        if ((answer == 'Y') || (answer == 'y')) {
            return true;

        } else if ((answer == 'N') || (answer == 'n')) {
        }
        return false;
    }

    public static void main(String[] args) {
        boolean anotherBatter = true;
        while (anotherBatter) { //play again loop
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the Batting Average Calculator!");
            System.out.println();
            System.out.println("Enter number of times at bat: ");
            int timesAtBat = input.nextInt();
            
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

            int[] newArray = new int[timesAtBat]; //type[] arrayName = new type[length];
            int j = 0;
            for (j = 0; j < timesAtBat; ++j) { //ask user for results loop
                System.out.print("Result for at-bat " + j + ": ");

                newArray[j] = input.nextInt(); //stores user input into Array
            }
            double sumOfBases = 0;
            for (j = 0; j < timesAtBat; ++j) {//loop that adds values within Array(number of bases earned)

                sumOfBases = sumOfBases + newArray[j]; 
            }                                    //number of bases divided by times at bat is slug percentage 
            double slugPercentage = ((sumOfBases) / (timesAtBat) * 1.000); //calculating slug percentage
            System.out.printf("Slugging Percentage: %.3f%n", slugPercentage);

            for (j = 0; j < timesAtBat; ++j) { //loop that turns at-bat results in "1" or "0".

                if (newArray[j] != 0) {
                    newArray[j] = 1;
                }
            }
            double sumVal = 0;
            for (j = 0; j < timesAtBat; ++j) { //loop that adds at-bat results as 1 or 0. (ex. 1+1+0+1)

                sumVal = sumVal + newArray[j];
            }
            double average = ((sumVal) / (timesAtBat) * 1.000); //batting average equation
            System.out.printf("Batting average: %.3f%n",average);

            anotherBatter = continueGame();
        }
        System.out.print("Goodbye");
    }
}
