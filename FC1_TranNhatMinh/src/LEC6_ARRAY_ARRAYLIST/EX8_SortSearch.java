package LEC6_ARRAY_ARRAYLIST;
import java.util.*;
public class EX8_SortSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Nhap 5 so nguyen tu nguoi dung
        System.out.println("Nhap 5 so nguyen:");
        for (int i = 0; i < 5; i++) {
            System.out.print("So thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sap xep mang tang dan
        Arrays.sort(numbers);
        System.out.println("\nMang sau khi sap xep tang dan:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Tim vi tri cua mot so trong mang
        System.out.print("\n\nNhap so can tim: ");
        int target = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // In ket qua tim kiem
        if (index != -1) {
            System.out.println("So " + target + " nam o vi tri " + (index + 1) + "(index " + index + ") trong mang da sap xep.");
        } else {
            System.out.println("Khong tim thay so " + target + " trong mang.");
        }
    }
}