package LEC3;
import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
        System.out.print("Nhap ho: ");
        Scanner s = new Scanner(System.in);
        String ho = s.nextLine();
        System.out.print("Nhap ten: ");
        String ten = s.nextLine();
        System.out.println("Your name: " + ho + " " + ten);
    }
}
