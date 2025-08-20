package LEC4_ConditionExpression;
import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("This is not an equation.");
            } else {
                double x = -c / b;
                System.out.println("This is a linear equation. The root is: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("The equation has no real roots.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one real double root: x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        input.close();
    }
}
