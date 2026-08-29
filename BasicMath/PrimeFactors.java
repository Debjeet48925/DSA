package BasicMath;

import java.util.*;

public class PrimeFactors {
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
    public static void primeFactors(int num){
        for(int i=1;i<Math.sqrt(num);i++)
        {
            if(num%i==0 && isPrime(i))
            {
                System.out.print(i+" ");
                if(num/i!=i && isPrime(num/i))
                {
                    System.out.print(num/i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.:");
        int num=sc.nextInt();
        primeFactors(num);
        sc.close();
    }
}
