package warmUpPrograms;

/**
 * Created by brijesh on 12/4/17.
 */

/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

public class diff21 {
    public int Diff21(int n){
        if (n <= 21){
            return (21 - n);
        }
        return (21 - n) *2;

    }

    public static void main(String[] args) {

        diff21 diff = new diff21();
        System.out.println(diff.Diff21(15));
        System.out.println(diff.Diff21(21));
        System.out.println(diff.Diff21(35));
    }

}
