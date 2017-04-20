package warmUpPrograms;

/**
 * Created by brijesh on 15/4/17.
 */
public class FrontBack {
    /*
    * Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
    public String frontBack(String string){
        if (string.length() <= 1){
            return  string;
        }
        String mid = string.substring(1, string.length() -1);
        return string.charAt(string.length()- 1) + mid + string.charAt(0);
    }

    public static void main(String[] args) {
        FrontBack fb = new FrontBack();
        System.out.println(fb.frontBack("code"));
        System.out.println(fb.frontBack("a"));
        System.out.println(fb.frontBack("ab"));

    }

}
