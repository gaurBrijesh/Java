package warmUpPrograms;

/**
 * Created by brijesh on 15/4/17.
 */
public class missingChar {
    /*
  Given a non-empty string and an int n, return a new string where the char at index n has been removed.
  The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
*/
    public String missingCharac(String str, int n){

        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());
        return  front + back;
    }

    public static void main(String[] args) {
        missingChar miss = new missingChar();
        System.out.println(miss.missingCharac("kitten",1));
        System.out.println(miss.missingCharac("kitten",0));
        System.out.println(miss.missingCharac("kitten",4));
    }
}
