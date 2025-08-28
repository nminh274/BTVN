package LEC6_ARRAY_ARRAYLIST;

import java.util.*;

public class EX1_FindtheMaximumandMinimum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input length of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input #" + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
