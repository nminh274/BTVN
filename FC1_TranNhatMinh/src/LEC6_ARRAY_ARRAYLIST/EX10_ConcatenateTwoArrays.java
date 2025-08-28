package LEC6_ARRAY_ARRAYLIST;
import java.util.Scanner;
public class EX10_ConcatenateTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang thu nhat: ");
        int size1 = scanner.nextInt();
        int[] a1 = new int[size1];

        // Nhập phần tử cho mảng thứ nhất
        System.out.println("Nhap cac phan tu cua mang thu nhat:");
        for (int i = 0; i < size1; i++) {
            System.out.print("a1[" + i + "] = ");
            a1[i] = scanner.nextInt();
        }

        System.out.print("Nhap so luong phan tu cua mang thu hai: ");
        int size2 = scanner.nextInt();
        int[] a2 = new int[size2];

        System.out.println("Nhap cac phan tu cua mang thu hai:");
        for (int i = 0; i < size2; i++) {
            System.out.print("a2[" + i + "] = ");
            a2[i] = scanner.nextInt();
        }

        int[] result = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            result[i] = a1[i];
        }

        for (int i = 0; i < size2; i++) {
            result[size1 + i] = a2[i];
        }

        System.out.print("Mang sau khi noi: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}