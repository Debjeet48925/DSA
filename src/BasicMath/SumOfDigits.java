package BasicMath;
import java.util.*;

public class SumOfDigits {
    static int sum_digits(int num){
        int sum=0;
        int rem;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int ans=sum_digits(num);
        System.out.println("The result is= "+ans);
        sc.close();
    }
}
