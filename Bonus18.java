package bonus.pkg18;

import java.util.Scanner;

public class Bonus18 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String input = "";
        char answer = '-';
        int number = 0;
        String name = "";
        String eyes = "";

        System.out.print("Welcome! What is your name?:");
        name = scnr.next();

        System.out.println();

        System.out.print("Would you like to play a game?:(enter yes or no)");

        input = scnr.nextLine();
        answer = input.charAt(0);

        if (answer == 'y') {//change to make  more specific.

            System.out.println("Excellent! You are walking across a field and");
            System.out.print("you encounter a fire-breathing dragon!");
            System.out.print(" What would you do? (enter face the beast OR run away)");

        } else if (answer != 'y') {
            System.out.print("Goodbye");
        }
        String x = "face the beast";
        String y = "run away";
        scnr.nextLine();
        input = scnr.nextLine();

        if (input.equals(x)) {
            System.out.print("You approach the dragon. You see that he");
            System.out.print(" has__heads. (enter 1 or 2 or 3)");

            number = scnr.nextInt();

            System.out.print("No one has ever faced a " + number + " headed dragon before!");
            System.out.println("Choose your weapon.(enter slingshot or sword or bow and arrow):");

            scnr.nextLine();
            input = scnr.nextLine();

            System.out.print("Armed with your " + input + ", you approach the dragon.");
            System.out.print("You can feel its fiery breath as you get closer.");
            System.out.println("It stares at you with its___ eyes. (enter red or blue):");

            
            eyes = scnr.nextLine();

            System.out.print("Oh thank goodness! " + eyes + "-eyed dragons are friendly.");
            System.out.print("You pet it and become friends.");
            System.out.println("You name the dragon___.(enter a name)");

           
            input = scnr.nextLine();

            System.out.print(name + " and " + input + " live happily ever after.");

        } else if (input.equals(y)) {
            System.out.print("Cya later chicken");
        }
    }

}
