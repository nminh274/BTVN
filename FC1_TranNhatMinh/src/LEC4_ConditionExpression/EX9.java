package LEC4_ConditionExpression;
import java.util.*;
public class EX9 {
    public static float find(float x){
        if(x > 0){
            return x;
        }else{
            return -x;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        float x = s.nextFloat();
        System.out.println("The absolute value is: " + find(x));
    }
}
