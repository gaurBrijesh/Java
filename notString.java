package warmUpPrograms;

/**
 * Created by brijesh on 14/4/17.
 */
public class notString {
    /*
    * Given a string, return a new string where "not" has been added to front. However, if the string already begings
    * with "not", return the string unchanged. Note: use .equals() to compare 2 strings
    * notString("candy") --> "not candy"
    * notString("x") --> "not x"
    * notString("not bad") --> "not bad"
    * */

    public String notStrings(String string){
        if ((string.length() >= 3) && (string.substring(0,3).equals("not"))){
            return string;
        }

            return "not " + string;
    }

    public static void main(String[] args) {
        notString str = new notString();
        System.out.println(str.notStrings("candy"));
        System.out.println(str.notStrings("x"));
        System.out.println(str.notStrings("not bad"));

    }
}
