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
		
		// Scanner class instantiated to be able to read user input
		Scanner readInput = new Scanner(System.in);
		
        	String enteredString;
        	String wantContinue = "Y";
        
        	while (wantContinue.equals("Y")) {
        	
        	System.out.println("Enter the string");
        	enteredString = readInput.next();
        	
        	System.out.println("The max running length in the string is: " + 
        	FindMaxRun(enteredString));
            	System.out.println("Would you like to continue? (enter Y or N)");
            
            	wantContinue = readInput.next();

            while (!(wantContinue.equals("Y") || wantContinue.equals("N"))) {
                // makes sure user enters valid option for continuation

                System.out.println("Invalid option entered");
                System.out.println("Would you like to continue? "
                		+ "(enter Y or N)");
                wantContinue = readInput.next();
            }
        }
        
        if (wantContinue.equals("N")) {
            // finishes the program if continuation is not wanted
            System.out.println("");
            System.out.println("Done.");
        }

	}
	
	public static int FindMaxRun (String inputString) {
		// this function finds the max run of a string
		
		int charCount = 1;
        int maxCount = 1;
		
		for (int iterator = 0; iterator < inputString.length()-1; 
				iterator++) {
            // this for loop loops through all characters in the string

            if (inputString.charAt(iterator) == inputString.charAt
            		(iterator + 1)) {
                // this if statement checks if the next character is 
            	//     the same as the current

                charCount++;

                if (charCount > maxCount) {
                    // setting the max count to the running count if the 
                    //    running count is greater
                    maxCount = charCount;
                }
            }
              else {
                // reset the running count if the consecutive run of 
            	//    a character ends
                charCount = 1;
            }
        }
		
		return maxCount;
		
	}

}
