package LEC4_ConditionExpression;
import java.util.*;
public class EX6 {
    public static float find(float x) {
         if(x >= 9.0 && x < 10.0){
             System.out.println("Excellent");
         } else if(x >= 8.0 && x < 9.0) {
             System.out.println("Good");
         } else if(x >= 6.5 && x < 8.0){
             System.out.println("Fair");
         } else if(x >= 5.0 && x < 6.5){
             System.out.println("Average");
         } else{
             System.out.println("Fail");
         }
         return x;
    }
    public static void main(String[] args) {
        float x;
        Scanner s = new Scanner(System.in);
        System.out.print("Input your point: ");
        x = s.nextFloat();
        System.out.print(find(x));
        System.out.println(" point!");
    }
}
