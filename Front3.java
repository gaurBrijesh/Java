package warmUpPrograms;

/**
 * Created by brijesh on 15/4/17.
 */
public class Front3 {
    /*
    * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/
    public String  front3(String string){
        String front;
        if (string.length() >= 3){
            front = string.substring(0,3);
        }else {
            front = string;
        }
return front +front +front;
    }

    public static void main(String[] args) {
        Front3 front = new Front3();
        System.out.println(front.front3("JAVA"));
        System.out.println(front.front3("Chocolate"));
        System.out.println(front.front3("abc"));
        System.out.println(front.front3("ef"));
    }
}
