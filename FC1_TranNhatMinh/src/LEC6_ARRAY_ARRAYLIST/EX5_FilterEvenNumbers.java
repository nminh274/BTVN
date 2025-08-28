package LEC6_ARRAY_ARRAYLIST;
import java.util.*;
public class EX5_FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap sl phan tu: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ENum = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            System.out.print("Nhap phan tu: ");
            arr[i] = s.nextInt();
            if(arr[i] % 2 == 0){
                ENum.add(arr[i]);
            } 
        }
        System.out.println("Cac so chan: " + ENum);
    }
}
