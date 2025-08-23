package LEC6;
import java.util.*;
public class EX2_Multiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
