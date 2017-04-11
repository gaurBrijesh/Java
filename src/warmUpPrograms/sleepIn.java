package warmUpPrograms;

/**
 * Created by brijesh on 12/4/17.
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
