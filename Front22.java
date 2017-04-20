package warmUpPrograms;

/**
 * Created by brijesh on 16/4/17.
 */
public class Front22 {
    /*
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
     so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"
 */
    public  String front22(String string){
        // First figure out no. chars to take
        int take =  2;
        if (take > string.length()){
            take = string.length();
        }
        String front = string.substring(0,take);
        return front + string + front;

    }

    public static void main(String[] args) {
         Front22 front22 =  new Front22();
        System.out.println(front22.front22("kitten"));
        System.out.println(front22.front22("HA"));
        System.out.println(front22.front22("abc"));
        System.out.println(front22.front22("a"));
    }
}
