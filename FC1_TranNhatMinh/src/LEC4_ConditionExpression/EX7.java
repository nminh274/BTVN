package LEC4_ConditionExpression;
import java.util.Scanner;
public class EX7 {
    public static float find(float x,float y,float z){
        if(x > y && x > z){
            return x;
        } else if(y > x && y > z){
            return y;
        } else  {
            return z;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = s.nextFloat();
        System.out.print("Input y: ");
        float y = s.nextFloat();
        System.out.print("Input z: ");
        float z = s.nextFloat();
        System.out.println(find(x,y,z) + " is the largest number");
    }
}
