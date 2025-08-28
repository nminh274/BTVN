package LEC6_ARRAY_ARRAYLIST;
import java.util.*;
public class EX6_UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        System.out.println("Nhap cac so nguyen (nhap -1 de dung):");
        while (true) {
            input = s.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Cac so da nhap: " + numbers);
        System.out.println("Tong: " + sum);
    }
}
}
