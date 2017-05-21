import java.util.Scanner;

/**
 * Created by brijesh on 21/5/17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int pass,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int array = scanner.nextInt();
        Integer[] arr = new Integer[array];
        for (int i =0; i < arr.length;i++){
            System.out.println("Enter the array element: " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }

        for (pass = 0; pass < arr.length-1 ;pass++)
            for (j =0 ; j < arr.length-1-pass ;j++)
        if (arr[j] > arr[j+1])
            arr[j] = arr[j+1] ^ arr[j] ^ (arr[j+1] = arr[j]);
        for (int s: arr) {
            System.out.println(s);
        }
    }
}
