/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC5;

import java.util.*;

public class GachaDice_EX11 {

    public static void main(String[] args) {
        Random ran = new Random();
        int tries = 1;
        int dice1 = ran.nextInt(6) + 1;
        int dice2 = ran.nextInt(6) + 1;
        if (dice1==dice2)
        {
            System.out.println("You got double after " + tries +" tries");
        }
        while (dice1 != dice2) {
            dice1 = ran.nextInt(6) + 1;
            dice2 = ran.nextInt(6) + 1;
            tries++;
            if (dice1 == dice2) {
                System.out.println("You got double after " + tries +" tries");
                break;
            }
        }
    }
}
