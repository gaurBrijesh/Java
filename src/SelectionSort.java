import java.util.Scanner;

/**
 * Created by brijesh on 21/5/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int array = scanner.nextInt();
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element: " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        selectionSort.print(arr);

    }

    void  sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            int minIndex = i;

            for (int j = i+1; j < arr.length ;j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            arr[i] = arr[minIndex] ^ arr[i] ^ (arr[minIndex] = arr[i]);
        }

    }

    void  print(int [] arr){
        for (int s : arr) {
            System.out.println(s);

        }
    }
}
