package LEC6;
import java.util.*;
public class EX7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Your guess: ");
        int n = s.nextInt();
        System.out.print("(Computer generated): ");
        Random rand = new Random();
        int r = rand.nextInt(100) + 1;
        System.out.println(r);
        if(n == r) {
            System.out.println("Congratulations! You guessed correctly!");  
        } else if(n < r){
            System.out.println("Your number is lower than the secret number");
        } else {
            System.out.println("Your number is higher than the secret number");
        }
    }
}
