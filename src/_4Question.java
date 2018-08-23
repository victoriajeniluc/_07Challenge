/**
 * Question 4:
 * Write a java program to accept more than 1 digit as command-line arguments and display the
 * highest digit to the user.
 * For example, if user passes 9, 14, 0, 23, 98, 2, 45
 * Output should be: Highest digit is: 98
 */

public class _4Question {
    public static void main(String[] args) {
        // Check if there are more than 1 digit being passed
        if(args.length <= 1) {
            System.out.println("Please enter more than 1 number otherwise this program won't work girl");
        } else {
            // Convert args from a string to a number
            for(int i = 0; i < args.length; i++) {
                args[i] = Integer.parseInt(args[i]);
            }

            // Create a variable to store the highest digit
            int max = args[0];

            // Loop through the array to find the highest number
            for(int val : args) {
                if(val >= max) {
                    max = val;
                }
            }
            System.out.println("Highest digit is: " + max);
        }

    }
}
