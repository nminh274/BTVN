package LEC3;
import java.util.Scanner;
public class EX9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        float number = s.nextFloat();
        
        s.nextLine();
        
        System.out.println("Input sentence: ");
        String sen = s.nextLine();
        
        System.out.println("Number: " + number);
        System.out.println("Sentences: " + sen);
    }
}
