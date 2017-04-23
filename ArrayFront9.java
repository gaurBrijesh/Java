package warmUpPrograms;

/**
 * Created by brijesh on 23/4/17.
 */
public class ArrayFront9 {
    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public  boolean arrayFront9(int[] numbers){
        int end = numbers.length;
        if (end > 4) end =4;
        for (int i= 0; i < end; i++){
            if (numbers[i] == 9){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayFront9 af = new ArrayFront9();
        System.out.println(af.arrayFront9(new int[]{1,2,9,3,4}));
        System.out.println(af.arrayFront9(new int[]{1,2,3,4,9}));
        System.out.println(af.arrayFront9(new int[]{1,2,3,4,5}));
    }
}
