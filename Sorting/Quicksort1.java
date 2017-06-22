import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        int[] arr;
        int pivot = 0;
        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();
        ArrayList<Integer> equalArr = new ArrayList<Integer>();

        /* Input */
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        /* Quicksort - i = 1 to begin after the pivot*/
        pivot = arr[0];
        equalArr.add(pivot);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                //place in left array
                leftArr.add(arr[i]);
            }
            else if (arr[i] > pivot) {
                rightArr.add(arr[i]);
            }
            else {
                //equals pivot
                equalArr.add(arr[i]);
            }
        }

        /* Print arrays */
        for (int num : leftArr) {
            System.out.print(num + " ");
        }
        for (int num : equalArr) {
            System.out.print(num + " ");
        }
        for (int num : rightArr) {
            System.out.print(num + " ");
        }
    }
}

/* Without multiple array lists */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        int[] arr;
        int pivot = 0;

        /* Input */
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        /* Quicksort - i = 1 to begin after the pivot*/
        pivot = arr[0];
        int low = 1;
        int high = arr.length - 1;
        while (low <= high) {

            while (arr[low] < pivot) {
                low++;
            }
            /* Want values higher than the pivot to remain above the pivot */
            while (arr[high] > pivot) {
                high--;
            }

            if (low < high) {
                /* swap */
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
            else {
                /* swap pivot */
                int temp = arr[high];
                arr[high] = arr[0];
                arr[0] = temp;
            }
        }

        /* Print arrays */
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
