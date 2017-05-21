import java.util.Scanner;

/**
 * Created by brijesh on 21/5/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int array = scanner.nextInt();
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element: " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.Sort(arr);
        insertionSort.print(arr);
    }

    void Sort(int[] arr){
        for(int i = 1;i<arr.length; ++i)

    {
        int Indexkey = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > Indexkey) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = Indexkey;
    }
}
void print(int[] arr){
        for (int s : arr) {
            System.out.println(s);
        }
         }

}
