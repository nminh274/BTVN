package LEC4_ConditionExpression;
import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        int x = s.nextInt();
        switch (x){
            case 2: System.out.println("Monday!");
                break;
            case 3: System.out.println("Tuesday!");
                break;
            case 4: System.out.println("Wednesday!");
                break;
            case 5: System.out.println("Thursday!");
                break;
            case 6: System.out.println("Friday!");
                break;
            case 7: System.out.println("Saturday!");
                break;
            case 8: System.out.println("Sunday!");
                break;
            default: System.out.println("Wrong day!");
                break;
        }
    }
}
