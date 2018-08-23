/**
 * Question 4:
 * Write a java program to accept more than 1 digit as command-line arguments and display the
 * highest digit to the user.
 * For example, if user passes 9, 14, 0, 23, 98, 2, 45
 * Output should be: Highest digit is: 98
 *
 * @author Udayan Khattry
 */

public class _4Question {
    public static void main(String[] args) {
        // Check if there are more than 1 digit being passed
        if(args.length <= 1) {
            System.out.println("Please enter more than 1 number otherwise this program won't work girl");
            return;
        } else {

            // Create integer array of the same length as the String args array.
            int [] arr = new int[args.length];

            // Command line arguments are String values...
            // Convert args from a string to a number
            for(int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            // Create a variable to store the highest digit.. we can use the first element
            int max = arr[0];

            // Loop through the array to find the highest number from the 2nd element and onwards
            for(int n = 1; n < arr.length; n++) { // Loop
                if(max < arr[n]) {
                    max = arr[n];
                }
            }
            System.out.println("Highest digit is: " + max);
        }

    }
}
