package printpattern2;

import java.util.Scanner;

public class PrintPattern2 {
    
    public static void printAtriangle(int input) {
        
        int j = 0;
        int i = 0;

        for (i = 1; i <= input; i++) {

            for (j = input; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
        return;
        }


    public static void main(String[] args) {
        
       Scanner scnr1 = new Scanner(System.in);
        
        int input1 = 0;
        System.out.print("Enter a number: ");
        input1 = scnr1.nextInt();

        System.out.print(printAtriangle(input1));

    }
}
