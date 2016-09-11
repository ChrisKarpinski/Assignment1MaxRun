/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program calculates the maximum run of consecutive characters in a
 *     given string
 *
 ****************************************************************************/

import java.util.Scanner;

public class MaxRun {

    public static void main(String[] args) {

        int charCount = 1;
        int maxCount = 1;
        String enteredString;
        String wantContinue = "Y";

        // Scanner class instantiated to be able to read user input
        Scanner readInput = new Scanner(System.in);

        while (wantContinue.equals("Y")) {

            System.out.println("Enter the string");
            enteredString = readInput.next();

            for (int iterator = 0; iterator < enteredString.length()-1; iterator++) {
                // this for loop loops through all characters in the string

                if (enteredString.charAt(iterator) == enteredString.charAt(iterator + 1)) {
                    // this if statement checks if the next character is the same as the current

                    charCount++;

                    if (charCount > maxCount) {
                        // setting the max count to the running count if the running count
                        //    is greater
                        maxCount = charCount;
                    }
                }
                  else {
                    // reset the running count if the consecutive run of a character ends
                    charCount = 1;
                }
            }

         System.out.println("The max running length in the string is: " + maxCount);
         System.out.println("Would you like to continue? (enter Y or N)");

         wantContinue = readInput.next();

         while (!(wantContinue.equals("Y") || wantContinue.equals("N"))) {
             // makes sure user enters valid option for continuation

             System.out.println("Invalid option entered");
             System.out.println("Would you like to continue? (enter Y or N)");
             wantContinue = readInput.next();
         }
        // reset the max count back to start at 1 for new input
         maxCount = 1;

         if (wantContinue.equals("N")) {
             // finishes the program if continuation is not wanted
             System.out.println("");
             System.out.println("Done.");
         }


         }

    }

}
