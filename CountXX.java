package warmUpPrograms;

/**
 * Created by brijesh on 20/4/17.
 */
public class CountXX {
    /*
    * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3*/

    public  int countXX(String string){
        int count =0;
        for (int i =0; i < string.length()-1;i++){
            if (string.substring(i,i+2).equals("xx"))
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountXX cx = new CountXX();
        System.out.println(cx.countXX("abcxx"));
        System.out.println(cx.countXX("xxx"));
        System.out.println(cx.countXX("xxxx"));
    }
}
