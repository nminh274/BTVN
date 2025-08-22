package LEC5;

import java.util.*;


public class PrimeNumber_EX12 {

    public static boolean isPrime(int a)
    {
       int dem =0;
        for (int i = 1;i<=a;i++)
        {
            //int dem = 0;
            if(a%i==0)
            {
                dem++;
            }
        }
        if (dem!=2)
        {
            return false;
        } else 
        {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int x = s.nextInt();
        if(isPrime(x)==true)
        {
            System.out.println(x + " is a prime number!");
        }else {
            System.out.println(x + " is not a prime number!");
        }

        
    }
}
