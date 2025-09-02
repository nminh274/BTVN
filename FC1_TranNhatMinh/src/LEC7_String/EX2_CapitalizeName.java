package LEC7_String;
import java.util.*;
public class EX2_CapitalizeName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        //String name = s.nextLine().trim().toLowerCase();
        String[] chuoi = s.nextLine().toLowerCase().split("\\s+");
        for(int n = 0;n < chuoi.length;n++){
            if(!chuoi[n].isEmpty()){
            chuoi[n] = chuoi[n].substring(0,1).toUpperCase() + chuoi[n].substring(1);
            }
        }
        System.out.println(Arrays.toString(chuoi));
        //System.out.println(chuoi.toString());
    }
}
