package LEC6_ARRAY_ARRAYLIST;
import java.util.*;

public class EX2_ReverseArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Mang goc: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.print("Mang sau khi dao nguoc:");
        System.out.println(Arrays.toString(arr));
    }
}