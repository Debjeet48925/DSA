package BasicMath;

import java.util.*;

public class Power {
    public static void power(int n,int x)
    {
        int ans=1;
        while (x>0)
        {
            if(x%2==1)
            {
                ans*=n;
                x=x-1;
            }
            else {
                n=n*n;
                x=x/2;
            }
        }
        System.out.println("Answer="+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num=sc.nextInt();
        System.out.println("Enter the  power: ");
        int p=sc.nextInt();
        power(num,p);
        sc.close();
    }
}
