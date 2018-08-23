/**
 * Write nested enhanced for-loop to iterate through the following 2-D Dimensional array
 *
 */

public class _1Question {
    public static void main(String[] args) {
        char [][] arr = {
                {'*'},
                {'*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*', '*', '*'},
        };

        for(char[] i : arr ) {
            for(char j : i) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
