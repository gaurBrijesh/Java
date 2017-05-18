package Algorithm;

/**
 * Created by brijesh on 18/5/17.
 */

/**
 * the binary-search algorithm searches a one-dimensional array for a specific data item. Unlike linear-search, however, binary-search divides the one-dimensional array into lower and upper sections by calculating the middle element's index. If the data item is found in that element, binary-search ends. If the data item is numerically less than the data item in the middle element, binary-search calculates the index of the middle element in the lower section, ignores the upper section, and repeats. Otherwise, binary-search calculates the index of the middle element in the upper section, ignores the lower section, and repeats. The search continues until either the data item is found or the current section's lower bound exceeds the upper bound
 */
/*
DECLARE INTEGER x [] = [ -5, 12, 15, 20, 30, 72, 456 ]
DECLARE INTEGER loIndex = 0
DECLARE INTEGER hiIndex = LENGTH (x) - 1
DECLARE INTEGER midIndex, srch = 72
WHILE loIndex <= hiIndex
   midIndex = (loIndex + hiIndex) / 2
   IF srch > x [midIndex] THEN
      loIndex = midIndex + 1
   ELSE
   IF srch < x [midIndex] THEN
      hiIndex = midIndex - 1
   ELSE
      EXIT WHILE
   END IF
END WHILE
IF loIndex > hiIndex THEN
   PRINT srch, " not found"
ELSE
   PRINT srch, " found"
END IF
END
 */
public class BSearchDemo {
    public static void main(String[] args) {
        int [] x = {-5,12,35,72,56,76,89,98,2,45,34};
        int loIndex =0;
        int hiIndex = x.length -1;
        int midIndex, search = 72;

        while (loIndex <= hiIndex){
            midIndex = (loIndex + hiIndex) / 2;

            if (search > x[midIndex])
                loIndex = midIndex +1;
            else
                if (search < x[midIndex])
                    hiIndex = midIndex -1;
            else
                break;
        }
        if(loIndex > hiIndex)
            System.out.println(search + " not found");
        else
            System.out.println(search + " found");
    }
}
