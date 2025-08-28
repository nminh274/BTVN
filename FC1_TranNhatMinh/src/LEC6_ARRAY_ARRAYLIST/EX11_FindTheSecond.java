package LEC6_ARRAY_ARRAYLIST;
import java.util.*;

public class EX11_FindTheSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("Can nhap it nhat 2 phan tu.");
            return;
        }

        int[] arr = new int[num];
        System.out.println("Nhap " + num + " so nguyen:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int largest = arr[num - 1];
        int secondLargest = largest;

        for (int i = num - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == largest) {
            System.out.println("Khong co gia tri lon thu hai (tat ca phan tu giong nhau).");
        } else {
            System.out.println("Gia tri lon thu hai la: " + secondLargest);
        }
    }
}