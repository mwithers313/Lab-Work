package lab1bonus1;

import java.util.Scanner;

public class Lab1Bonus1 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Letter Grade Converter!");
        int grade = 0;
        String userInput = "";
        char answer = '-';
        do {
            System.out.println("Enter a numerical grade:");

            grade = scnr.nextInt();

            if (grade >= 88) {
                System.out.print("Letter Grade: A");

            } else if (grade >= 80) {
                System.out.print("Letter Grade: B");
            } else if (grade >= 67) {
                System.out.print("Letter Grade: C");
            } else if (grade >= 60) {
                System.out.print("Letter Grade: D");
            } else if (grade <= 59) {
                System.out.print("Letter Grade: F");
            }

            System.out.println();
            System.out.print("Continue?(y/n)");

            

        System.out.print("Goodbye");
    }

}
