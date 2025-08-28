package LEC6_ARRAY_ARRAYLIST;
import java.util.Scanner;

public class EX3_CountOccurences {
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu mang: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = s.nextInt();
        }

        System.out.print("Nhap so can tim: ");
        int x = s.nextInt();

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }

        System.out.println("So " + x + " xuat hien " + count + " lan trong mang.");
    }
}