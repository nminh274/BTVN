package LEC6;

import java.util.*;

public class EX8_InputValidation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Input Validation: ");
        int n = s.nextInt();
        if (n >= 1 && n <= 10) {
            System.out.println("You entered the number: " + n);
        } else {
            do {
                System.out.print("Invalid number, please try again: ");
                n = s.nextInt();
            } while (n < 1 || n > 10);
            System.out.println("You entered the number: " + n);
        }
    }
}
