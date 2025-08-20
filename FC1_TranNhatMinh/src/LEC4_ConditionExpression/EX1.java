package LEC4_ConditionExpression;
import java.util.Scanner;
public class EX1 {
    public static int find(int x){
        if(x % 2 == 0){
            System.out.println(x + " is even number!");
        } else {
            System.out.println(x + " is an odd number!");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = s.nextInt();
        System.out.println(find(x));
    }
}
