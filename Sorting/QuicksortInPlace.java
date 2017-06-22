import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        int[] arr;
        Scanner reader = new Scanner(System.in);

        n = reader.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }

        /* Quick sort */
        quicksort(arr, 0, arr.length - 1);

    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int p = partition(arr, lo, hi);
            printArray(arr);
            quicksort(arr, lo, p - 1);
            quicksort(arr, p + 1, hi);

        }
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo - 1;

        for (int j = lo; j <= hi; j++) {
            if (arr[j] <= pivot) {
                i++;
                if (i != j) {
                    swap(arr, i, j);
                }
            }
        }

        return i;
    }

    public static void swap(int[] arr, int lo, int hi) {
        int temp = arr[hi];
        arr[hi] = arr[lo];
        arr[lo] = temp;
    }

    public static void printArray(int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
