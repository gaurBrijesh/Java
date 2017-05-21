import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by brijesh on 21/5/17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        //int arr[] = {23,1,45,67,8,34,67};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int array = scanner.nextInt();
        Integer[] arr = new Integer[array];
        for (int i =0; i < arr.length;i++){
            System.out.println("Enter the array element: " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println(" Sorted Array: " + Arrays.toString(arr));
        int hiIndex = arr.length-1;
        System.out.println("Enter the searching value:");
        int search = scanner.nextInt();
        int loIndex = 0;
        int midIndex;

        while (loIndex <= hiIndex) {
            midIndex = (loIndex + hiIndex) / 2;
            if (search > arr[midIndex])
                loIndex = midIndex + 1;
            else if (search < arr[midIndex])
                hiIndex = midIndex - 1;
            else
                break;
        }
        if (loIndex > hiIndex)
            System.out.println(search + " not found.");
        else
            System.out.println(search + " found.");
    }
}
