package LEC6;

import java.util.*;

public class EX9_AverageCalculation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        float sum = 0;
        int i = 0;
        do {
            System.out.println("Enter a number (enter 0 to stop): ");
            n = nextInt();
            if (n != 0) {

                i++;
                sum = sum + n;
            }

        } while (n != 0);
        if (i > 0) {
            System.out.println("Average: " + (sum / i));
        } else {
            System.out.println("No number entered!");
        }
    }
}
