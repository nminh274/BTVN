package LEC3;
import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("##|\\n");
        System.out.println("Enter words separated by ##: ");
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
        s.close();
    }
}
