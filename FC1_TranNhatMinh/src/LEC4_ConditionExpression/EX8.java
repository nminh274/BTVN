package LEC4_ConditionExpression;

import java.util.*;

public class EX8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = s.nextFloat();
        System.out.print("Input y: ");
        float y = s.nextFloat();
        if (x > 0 && y > 0) {
            System.out.println("The point is in the 1nd quadrant!");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the 3rd quadrant");
        } else if(x > 0 && y < 0){
            System.out.println("The point is in the 4th quadrant");
        } else{
            System.out.println("The point is on an axis");
        }
    }
}
