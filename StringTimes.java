package warmUpPrograms;

/**
 * Created by brijesh on 20/4/17.
 */
public class StringTimes {
    /*
    * Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/
    public String stringTimes(String string, int n){
        String result="";
        for (int i =0 ; i < n; i++){
            result = result + string;
        }
        return  result;
    }

    public static void main(String[] args) {
        StringTimes st = new StringTimes();
        System.out.println(st.stringTimes("Hi",2));
        System.out.println(st.stringTimes("Hi",3));
        System.out.println(st.stringTimes("Hi",1));
    }
}
