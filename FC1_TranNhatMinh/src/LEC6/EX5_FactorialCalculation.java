package LEC6;
import java.util.*;
public class EX5_FactorialCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = 1;
        int n;
        do{
            System.out.print("Input N: ");
            n = s.nextInt();
        } while (n < 0);
        for(int i = 1;i <= n;i++){
            all = all * i;
        }
        System.out.println("The factorial of " + n + " is: " + all);
    }
}
