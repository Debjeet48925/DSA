package BasicMath;

import java.util.*;

public class Palindrome {
    public static boolean isPallindrome(int n)
    {
        int rev=0;
        int x=n;
        while(n>0)
        {
            int rem= n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==x)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPallindrome(num));
    }
}
