package BasicMath;
import java.util.*;

public class MaxMinDigit {
    static void max_min(int num){
        int rem;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        while(num!=0) {
            rem = num % 10;
            maxi=Math.max(maxi,rem);
            mini=Math.min(mini,rem);
            num /= 10;
        }
        System.out.println("The maximum number in the digit is:"+maxi);
        System.out.println("The minimum number in the digit is:"+mini);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        max_min(num);
        sc.close();
    }
}
