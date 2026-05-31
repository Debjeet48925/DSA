package BasicMath;

import java.util.*;

public class Divisor {
    public static void allDivisors(int n)
    {
        System.out.println("All the Divisors of "+n+" are:");
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) {
                System.out.print(i + " ");
                if(n/i!=i)
                {
                    System.out.print(n/i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.:");
        int num=sc.nextInt();
        allDivisors(num);
    }
}
