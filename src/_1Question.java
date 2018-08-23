/**
 * Question 1:
 * Write nested enhanced for-loop to iterate through following 2-Dimensional array:
 * char [][] arr = {
 * 		{'*'},
 * 		{'*', '*'},
 * 		{'*', '*', '*'},
 * 		{'*', '*', '*', '*'},
 * 		{'*', '*', '*', '*', '*'},
 * 		{'*', '*', '*', '*', '*', '*'},
 * 		{'*', '*', '*', '*', '*', '*', '*'},
 * };
 *
 * Following output is expected:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 *
 * @author Udayan Khattry
 */

public class _1Question {
    public static void main(String[] args) {

        // Copy the array
        char [][] arr = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*'},
        };

        // Nested enhanced for-loop
        for(char[] i : arr ) {
            for(char j : i) {
                System.out.print(j);
            }
            System.out.println(); // print a new line
        }


    }
}
