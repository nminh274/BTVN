package LEC3;
import java.util.Scanner;
public class ScannerString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("##");
        String a = s.nextLine();
        String b = s.nextLine();
        System.out.println(a);
        System.out.println(b);
        
    }
}
