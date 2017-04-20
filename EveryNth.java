package warmUpPrograms;

/**
 * Created by brijesh on 18/4/17.
 */
public class EveryNth {
    /*
    * Given a non-empty string and an int N, return the string made starting with char 0,
    * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
      everyNth("Miracle", 2) → "Mrce"
      everyNth("abcdefg", 2) → "aceg"
      everyNth("abcdefg", 3) → "adg"
*/
    public String everyNth(String string, int n){
        String result = "";
        for (int i = 0; i < string.length(); i = i + n){
            result = result + string.charAt(i);
        }
            return result;
    }

    public static void main(String[] args) {
        EveryNth en = new EveryNth();
        System.out.println(en.everyNth("Miracle" ,2));
        System.out.println(en.everyNth("abcdefg",2));
        System.out.println(en.everyNth("abcdefg",3));
    }
}
