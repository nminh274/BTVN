package LEC6;

import java.util.*;

public class EX3_DrawaRectangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        int h = s.nextInt();
        System.out.print("Width: ");
        int w = s.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
