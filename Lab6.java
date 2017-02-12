package lab6;
import java.util.Scanner;
public class Lab6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String vowels = "aeiouAEIOU";
        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.print("Enter a line to be translated: ");
        String input = sc.nextLine();

        String lowerCase = input.toLowerCase(); // take string and turn in to lowercase

        String[] retval = (lowerCase.split(" ")); //splitting the string

        for (int i = 0; i < retval.length; i++) {

            String nextElement = retval[i];

            String beforeVowel = "";
            int j = 0;
            while (j < nextElement.length() && !vowels.contains("" + nextElement.charAt(j))) {
                beforeVowel = beforeVowel + nextElement.charAt(j);
                j++;
            }
            if (j == 0) {
                j = 1;
                nextElement += nextElement.charAt(0) + "w";
            }
            System.out.print(nextElement.substring(j) + beforeVowel + "ay" + " ");

        }
    }
}
