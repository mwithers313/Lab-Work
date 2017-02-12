
package printpattern;

import java.util.Scanner;

public class PrintPattern {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        int j = 0;
        int i = 0;
       
       
        
        for (i = 0; i <= 8; i++) {
           
        //System.out.println("#");
           for (j = 1; j <= i + 1; ++j)
               System.out.print("#");
           System.out.println();
           
        }
           
        }
    }
    
    

