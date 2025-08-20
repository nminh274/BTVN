package LEC4_ConditionExpression;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        float x = s.nextInt();
        System.out.print("Input second number: ");
        float y = s.nextInt();
        System.out.print("Input operator(1: +, 2: -,3: *,4: /): ");
        float z = s.nextInt();
        if (z == 1) {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (z == 2) {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (z == 3) {
            System.out.println(x + " * " + y + " = " + (x * y));
        } else if (z == 4) {
            System.out.println(x + " + " + y + " = " + (x / y));
        }
    }

}
