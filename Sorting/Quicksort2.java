import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        int[] arr;

        /* Input */
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        /* Quicksort */
        quickSort(arr);
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    //Recursive sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1); //sort lower half
            quickSort(arr, index + 1, high); //sort higher half
            printSubArray(arr, low, high);
        }

    }

    //Partition method
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int lowPointer = low;
        int highPointer = high;

        while (lowPointer < highPointer) {

            //printArray(arr);
            while (arr[lowPointer] < pivot) {
                lowPointer++;
            }
            /* Want values higher than the pivot to remain above the pivot */
            while (arr[highPointer] > pivot) {
                highPointer--;
            }

            if (lowPointer < highPointer) {
                /* swap */
                swap(arr, lowPointer, highPointer);
            }
        }

        swap(arr, lowPointer, highPointer);
        return lowPointer;
    }

    public static void swap(int[] arr, int low, int high) {
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low] = temp;
    }
    public static void printSubArray(int[] arr, int low, int high) {
        //System.out.println("Low " + low);
        //System.out.println("High " + high);
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[] arr) {

        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
