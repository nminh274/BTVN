package LEC7_String;
import java.util.Arrays;
import java.util.Scanner;

public class EX4_CheckAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai chuỗi từ người dùng
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();

        // Kiểm tra độ dài trước
        if (str1.length() != str2.length()) {
            System.out.println("The two strings are not Anagrams.");
        } else {
            // Chuyển sang mảng ký tự và sắp xếp
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // So sánh hai mảng đã sắp xếp
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The two strings are Anagrams.");
            } else {
                System.out.println("The two strings are not Anagrams.");
            }
        }

        scanner.close();
    }
}