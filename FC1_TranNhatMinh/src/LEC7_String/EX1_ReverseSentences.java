package LEC7_String;
import java.util.*;
public class EX1_ReverseSentences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        String a = s.nextLine();
        String[] chuoi = a.split("\\s");
        for(int c = chuoi.length - 1;c>=0;c--){
            String v = chuoi[c];
            System.out.println(v);
        }
    }
}
