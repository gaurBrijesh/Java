package warmUpPrograms;

/**
 * Created by brijesh on 13/4/17.
 */

public class makes10 {
    /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
    */

    public boolean makes(int a , int b){
        boolean sum = (a + b) == 10;
        boolean make = ((a == 10) || (b == 10));
        if (sum || make){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        makes10 make = new makes10();
        System.out.println(make.makes(9,10));

    }
}
