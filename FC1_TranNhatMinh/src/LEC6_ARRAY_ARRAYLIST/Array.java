package LEC6_ARRAY_ARRAYLIST;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many days' temperature? ");
        int day = s.nextInt();
        int[] temp = new int[day];
        float avg = 0;
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Day " + (i + 1) + "'s temp: ");
            temp[i] = s.nextInt();
            avg = avg + temp[i];
        }
        avg = avg / day;
        System.out.printf("Average temp = %.1f ", avg);
        int dem = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > avg) {
                dem = dem + 1;
            }
        }
        System.out.println("");
        System.out.println(dem + " days above average!");
    }
}
