package Algorithm;

/**
 * Created by brijesh on 19/5/17.
 */

/**
 * The bubble-sort algorithm makes various passes over a one-dimensional array. For each pass, that algorithm compares adjacent data items to determine which is numerically larger or smaller.
 * Either the larger data item (for ascending order) or the smaller data item (for descending order) swaps with the adjacent data item and moves toward the bottom of the one-dimensional array.
 * By the end of the pass, the largest/smallest data item has moved toward the array's end. This "bubbling" effect is the origin of the bubble-sort algorithm's name.
 */

/**
 * DECLARE INTEGER i, pass
 DECLARE INTEGER x [] = [ 20, 15, 12, 30, -5, 72, 456 ]
 FOR pass = 0 TO LENGTH (x) - 2
 FOR i = 0 TO LENGTH (x) - pass - 2
 IF x [i] > x [i + 1] THEN
 SWAP x [i], x [i + 1]
 END IF
 NEXT i
 NEXT pass
 END
 */
public class BubbleSort {
    public static void main(String[] args) {
        int i, pass;
        int [] x = {20,15,46,13,67,8,90,23};
        for (pass =0; pass <= x.length-1;pass++)
            for (i =0; i < x.length -pass -1;i++)
                if (x[i] > x[i+1]){
            //int temp = x[i];
            //x[i] = x[i+1];
            //x[i+1] = temp;
                    x[i] = x[i] ^ x[i+1] ^ (x[i+1] = x[i]);  // one line swaping
                }
        for (int s: x
             ) {
            System.out.println(s);
        }
    }

}
