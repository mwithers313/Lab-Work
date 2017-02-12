package lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        String userInput = "";
        char answer = '-';
                
        do {        
        
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        System.out.println();

        System.out.println("Enter Length:");

        length = scnr.nextDouble();

        System.out.println("Enter Width:");

        width = scnr.nextDouble();

        area = (length * width);

        System.out.println("Area:" + area);
        
        perimeter = ((width * 2) + (length * 2)); 
        
        System.out.println("Perimeter:" + perimeter);
        
        System.out.println();
        
        System.out.print("Continue? (y/n): ");
        
         userInput = scnr.next();
         answer = userInput.charAt(0);
        }    
        while ((answer == 'Y') || (answer == 'y'));
     
    System.out.print("Goodbye");
    }
    
    }

