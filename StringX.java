package warmUpPrograms;

/**
 * Created by brijesh on 26/4/17.
 */
public class StringX {
    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
    */

    public String stringX(String string){
        String result = "";
        for (int i = 0; i < string.length(); i++){
            if (!(i > 0 && i < (string.length()-1) && string.substring(i,i+1).equals("x"))){
                result = result + string.substring(i,i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringX sx = new StringX();
        System.out.println(sx.stringX("xxHxix"));
        System.out.println(sx.stringX("abxxxcd"));
        System.out.println(sx.stringX("xabxxxcdx"));
    }
}
