package warmUpPrograms;

/**
 * Created by brijesh on 21/4/17.
 */
public class DoubleX {
    /**
     *Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

     doubleX("axxbb") → true
     doubleX("axaxax") → false
     doubleX("xxxxx") → true
     */

    public boolean doubleX(String string){

        //check the index character
        int i = string.indexOf('x');

        if (i == -1) return false;  // no x at all
        if (i+1 >= string.length()) return false; // check i+1 bound.

        //return string.substring(i+1,i+2).equals("x");
        String x = string.substring(i);
        return x.startsWith("xx");
    }

    public static void main(String[] args) {
        DoubleX dx = new DoubleX();
        System.out.println(dx.doubleX("axxbb"));
        System.out.println(dx.doubleX("axaxax"));
        System.out.println(dx.doubleX("xxxx"));

    }

}
