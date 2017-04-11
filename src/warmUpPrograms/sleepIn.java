package warmUpPrograms;

/**
 * Created by brijesh on 12/4/17.
 */

/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true
*/
public class sleepIn {
    public boolean SleepIn(boolean weekdays, boolean vacation){
        if (!weekdays || vacation){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        sleepIn sleep = new sleepIn();
        sleep.SleepIn(false,true);
    }
}
