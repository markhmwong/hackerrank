import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0, swapCounter = 0;
        int[] arr;
        Scanner reader = new Scanner(System.in);

        /* Read input */
        n = reader.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }

        /* Insertion Sort */
        /* begin at the second (i = 1) index */
        for (int i = 1; i < arr.length; i++) {
            /* Look at the first index (i = 0) */
            for (int j = i; j > 0; j--) {
                /* compare */
                if (arr[j] < arr[j - 1]) {
                    /* swap */
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    /* keep a counter of the times an index is swapped */
                    swapCounter++;
                }

            }
        }

        System.out.println(swapCounter);
    }

    public static void printArray(int[] arrTemp) {
        /* print array */
        for (int k = 0; k < arrTemp.length; k++) {
            System.out.print(arrTemp[k]);
        }
        System.out.println();
    }
}
