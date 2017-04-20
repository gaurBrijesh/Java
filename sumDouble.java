package warmUpPrograms;

/**
 * Created by brijesh on 12/4/17.
 */

/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public class sumDouble {
    public  int sumOrDouble(int a, int b){
        if (a != b){
            return a + b;
        }

        return (a + b) * 2;
    }

    public static void main(String[] args) {
        sumDouble sd = new sumDouble();
        System.out.println(sd.sumOrDouble(3,2));
        System.out.println(sd.sumOrDouble(4,4));
    }
}
