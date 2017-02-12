package gradeshistorgram;

import java.util.Scanner;

public class gradeshistogram {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] grades = new int[10];
        String[] grades1 = new String[10];

        int x = 0;
        int input = 0;
        int range = 100;

        System.out.println("Please enter a grade between 0-100. (-1 to quite):");

        boolean newStudent = true;

        while (input != -1) {
            input = scan.nextInt();

            if (input >= 0 && input <= 9) {
                grades[0] += 1;
            } else if (input >= 10 && input <= 19) {
                grades[1] += 1;
            } else if (input >= 20 && input <= 29) {
                grades[2] += 1;
            } else if (input >= 30 && input <= 39) {
                grades[3] += 1;
            } else if (input >= 40 && input <= 49) {
                grades[4] += 1;
            } else if (input >= 50 && input <= 59) {
                grades[5] += 1;
            } else if (input >= 60 && input <= 69) {
                grades[6] += 1;
            } else if (input >= 70 && input <= 79) {
                grades[7] += 1;
            } else if (input >= 80 && input <= 89) {
                grades[8] += 1;
            } else if (input >= 90 && input <= 100) {
                grades[9] += 1;
            }
        }

        for (int i = 0; i <= 9; i = i + 1) { //rows

            System.out.printf("%d - %d", i * 10, (i + 1) * 10 - 1);

            for (int k = 1; k <= grades[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

     

        }
    }
