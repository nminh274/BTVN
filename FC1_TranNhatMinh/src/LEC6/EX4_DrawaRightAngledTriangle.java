package LEC6;

import java.util.*;

public class EX4_DrawaRightAngledTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input height: ");
        int h = s.nextInt();
        for (int i = 1; i <= h; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");
    }
}
