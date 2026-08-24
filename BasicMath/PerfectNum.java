package BasicMath;

import java.util.*;

public class PerfectNum {
    public static boolean isPerfect(int n)
    {
        int sum=1;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            if(n/i!=i)
            {
                sum+=n/i;
            }
            if(sum==n)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int num=sc.nextInt();
        if( isPerfect(num))
        {
            System.out.println("it's a Perfect no.");
        }
        else {
            System.out.println("It's not a perfect no.");
        }
        sc.close();
    }
}
