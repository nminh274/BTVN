package LEC3;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = s.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = s.nextInt();
        System.out.println("Hello " + name + ", you're " + age + " years old!");
        
    }
}
