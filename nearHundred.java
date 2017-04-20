package warmUpPrograms;

/**
 * Created by brijesh on 13/4/17.
 */
public class nearHundred {

    /* Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

    public boolean nearHundredCheck(int n){
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        nearHundred nearNum = new nearHundred();
        System.out.println(nearNum.nearHundredCheck(90));
        System.out.println(nearNum.nearHundredCheck(89));

    }
}
