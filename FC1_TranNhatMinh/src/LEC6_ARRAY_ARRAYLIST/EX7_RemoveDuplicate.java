import java.util.ArrayList;
import java.util.Scanner;

public class EX7_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        System.out.println("Nhap " + n + " so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            int value = scanner.nextInt();
            originalList.add(value);
        }

        // Loai bo phan tu trung lap
        for (Integer number : originalList) {
            if (!resultList.contains(number)) {
                resultList.add(number);
            }
        }

        System.out.println("\nDanh sach ban dau: " + originalList);
        System.out.println("Danh sach sau khi loai bo trung lap: " + resultList);
    }
}