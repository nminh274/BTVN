package LEC5;
import java.util.*;
public class DrawIsoscelesTriangle_EX10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int a = s.nextInt();
        for(int i = 1;i <= a;i++)
        {
            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
