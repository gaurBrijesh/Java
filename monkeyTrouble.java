package warmUpPrograms;

/**
 * Created by brijesh on 12/4/17.
 */
/*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false
*/

public class monkeyTrouble {
    public boolean monkeySmile(boolean aSmile, boolean bSmile){
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile && !bSmile){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        monkeyTrouble smile = new monkeyTrouble();
        System.out.println(smile.monkeySmile(false, false));
    }
}
