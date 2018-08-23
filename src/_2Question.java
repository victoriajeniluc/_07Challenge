/**
 * Following code is given:
 * int tableOf = 7;
 * int [] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
 *
 * You are not allowed to declare any other variable, apart from declaration variable of for-each.
 * Write for-each loop to print following:
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 7 * 3 = 21
 * 7 * 4 = 28
 * 7 * 5 = 35
 * 7 * 6 = 42
 * 7 * 7 = 49
 * 7 * 8 = 56
 * 7 * 9 = 63
 * 7 * 10 = 70
 */
public class _2Question {
    public static void main(String[] args) {
        int tableOf = 7;
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int x : arr) {
            System.out.println(tableOf + " * " + x + " = " + (tableOf * x));
        }
    }
}
