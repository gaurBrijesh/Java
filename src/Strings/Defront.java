package Strings;

/**
 * Created by brijesh on 28/4/17.
 */
public class Defront {
    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/
    public String deFront(String string) {
        int len = string.length();
        if (len >= 2) {
            StringBuilder stringBuilder = new StringBuilder(len);
            if (string.charAt(0) == 'a')
                stringBuilder.append('a');
            if (string.charAt(1) == 'b')
                stringBuilder.append('b');
            stringBuilder.append(string.substring(2));
            return stringBuilder.toString();
        } else if (len == 1 && string.charAt(0) == 'a')
            return "a";
        else
            return "";
    }

    public static void main(String[] args) {
        Defront df = new Defront();
        System.out.println(df.deFront("Hello"));
        System.out.println(df.deFront("java"));
        System.out.println(df.deFront("away"));

    }
}
