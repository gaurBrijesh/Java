package Strings;

/**
 * Created by brijesh on 28/4/17.
 */
public class MinCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {
        int minLen;
        if(a.length() > b.length() && b.length() < a.length()){
            minLen = b.length();
            return a.substring(a.length() - minLen,a.length())+ b;
        }else{
            minLen = a.length();
            return a + b.substring(b.length() - minLen,b.length());
        }

    }

    public static void main(String[] args) {
        MinCat mc = new MinCat();
        System.out.println(mc.minCat("Hello", "Hi"));
        System.out.println(mc.minCat("Hello", "java"));
        System.out.println(mc.minCat("java", "Hello"));
    }

}
