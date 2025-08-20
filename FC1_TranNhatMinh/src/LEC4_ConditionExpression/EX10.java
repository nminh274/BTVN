package LEC4_ConditionExpression;

import java.util.*;

public class EX10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = s.nextFloat();
        System.out.print("Input y: ");
        float y = s.nextFloat();
        System.out.print("Input z: ");
        float z = s.nextFloat();
        if (x < (y + z)|| y < (x + z) || z <(y + x)){
            if(x == y && y == z || x == z){
                System.out.println("This is an equilateral triangle");
            } else if(x == y || y == z || x == z){
                System.out.println("This is an isosceles triangle.");
            } else if((x*x) == (y*y) + (z*z) || (y*y) == (x*x) + (z*z) || (z*z) == (y*y) +(z*z)) {
                System.out.println("This is a scalene triangle");
            }
            else {
                System.out.println("These sides cannot form a triangle.");
            }
        }
    }
}
