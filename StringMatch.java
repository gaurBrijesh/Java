package warmUpPrograms;

/**
 * Created by brijesh on 24/4/17.
 */
public class StringMatch {
    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
     */
    public int stringMatch(String string, String string1){
        int count =0;
        int len = Math.min(string.length(),string1.length());
        for (int i =0; i < len -1; i++ ){
            String Str1 = string.substring(i,i+2);
            String Str2 = string1.substring(i,i+2);
            if (Str1.equals(Str2)) {
                 count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringMatch sm  = new StringMatch();
        System.out.println(sm.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(sm.stringMatch("abc", "abc"));
        System.out.println(sm.stringMatch("abc", "axc"));
    }
}
