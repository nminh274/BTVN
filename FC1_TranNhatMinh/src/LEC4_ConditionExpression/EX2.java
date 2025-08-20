package LEC4_ConditionExpression;

import java.util.Scanner;

public class EX2 {

    public static int age(int x) {
        if (x > 0 && x < 12) {
            System.out.print("Child ");
        } else if (x > 13 && x < 19) {
            System.out.print("Teenager ");
        } else if (x > 20 && x < 59) {
            System.out.print("Adult ");
        } else if (x < 0) {
            System.out.print("Non existence ");
        } else {
            System.out.print("Senior ");
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input age: ");
        int x = s.nextInt();
        System.out.print(age(x));
        System.out.println(" years old");
    }
}
