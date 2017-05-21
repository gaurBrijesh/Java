import java.util.Scanner;

/**
 * Created by brijesh on 21/5/17.
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int array = scanner.nextInt();
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element: " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,0, arr.length-1);
        mergeSort.print(arr);

    }

    void merge(int [] arr, int l, int m , int r){
        //calculating the two halve lengths

        int lengthFirst = m-l+1;
        int lengthSecond = r-m;

        // create temp two half arrays
        int [] leftArray = new int[lengthFirst];
        int [] rightArray = new  int[lengthSecond];

        //coping data in both halves arrays
         for (int i = 0 ; i < lengthFirst;++i)
             leftArray[i] = arr[l+i];
         for (int j = 0; j < lengthSecond; ++j)
             rightArray[j] = arr[m+1+j];

         //initial index of halves arrays
        int i =0;
        int j =0;

        //initial index of merged subarray
        int k = l;

        while (i < lengthFirst && j < lengthSecond){
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //coping the remaining elements of left array

        while (i < lengthFirst) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        //coping the remaining elements of right array
        while (j < lengthSecond){
            arr[k] = rightArray[j];
            j++;
            k++;
        }


    }

    void sort(int [] arr, int l, int r){
        if(l < r) {
            //Find the middle point
            int m = (l + r) / 2;

            //Sort the first and second halves

            sort(arr,l, m);
            sort(arr, m+1, r);

            // merge the Sorted halves
            merge(arr, l,m,r);

        }
    }

    void  print(int [] arr){
        for (int s: arr) {
            System.out.println(s);
        }
    }

}
