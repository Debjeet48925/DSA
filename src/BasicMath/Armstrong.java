package BasicMath;

import java.util.*;

public class Armstrong {
    public static boolean isArmstrong(int n)
    {
        int sum=0;
        int count=0;
        int x=n;
        while(x!=0)
        {
            count++;
            x/=10;
        }
        x=n;
        while(x!=0)
        {
            int rem=x%10;
            sum+=Math.pow(rem,count);
            x/=10;
        }
        if(n==sum)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num=sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.println("Armstrong no.");
        }
        else {
            System.out.println("Not an Armstrong no.");
        }
    }
}
