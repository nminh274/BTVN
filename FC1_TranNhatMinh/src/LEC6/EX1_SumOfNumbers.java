package LEC6;
import java.util.Scanner;
public class EX1_SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input N = ");
        int n = s.nextInt();
        int sum = 0;
        for(int i = 0;i <= n;i++){
            sum = sum + i;
        }       
        System.out.println("Sum of the numbers from 1 to N = " + sum);
    }    
}