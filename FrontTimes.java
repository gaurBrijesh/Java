package warmUpPrograms;

/**
 * Created by brijesh on 20/4/17.
 */
public class FrontTimes {
    /*
    * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"*/
    public String frontTimes(String string, int n){
        int frontLen = 3;
        if (frontLen > string.length()){
            frontLen = string.length();
        }
        String front = string.substring(0,frontLen);
        String result = "";
        for (int i =0; i <n; i++){
            result = result + front;
        }
    return result;
    }

    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();
        System.out.println(ft.frontTimes("Chocolate",2));
        System.out.println(ft.frontTimes("Chocolate",3));
        System.out.println(ft.frontTimes("Abc",3));
    }
}
