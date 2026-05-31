package BasicMath;

import java.util.*;

public class Prime {
    public static boolean isPrime(int n)
    {
        int count=0;

        if(n<=1)
            return false;

       for(int i=2;i<n;i++)
       {
           if(n%i==0)
           {
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.:");
        int num=sc.nextInt();
        isPrime(num);
        if(isPrime(num))
        {
            System.out.println("This is Prime no.");
        }
        else{
            System.out.println("This is not a Prime no.");
        }
        sc.close();
    }
}
