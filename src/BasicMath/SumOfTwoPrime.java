package BasicMath;

import java.util.Scanner;

public class SumOfTwoPrime {
    public static boolean isPrime(int num)
    {
        if (num<=1)
            return false;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static boolean isSumPrime(int n)
    {
        int sum1,sum2;
        for(int i=1;i<n;i++)
        {
            sum1=i;
            sum2=n-i;
            if(isPrime(sum1) && isPrime(sum2)) {
                System.out.println(sum1+" "+sum2);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(isSumPrime(num))
        {
            System.out.println(num+" Can be expressed as sum of two prime numbers");
        }
        else {
            System.out.println(num+"  Can't be expressed as sum of two prime numbers");
        }
        sc.close();
    }
}
