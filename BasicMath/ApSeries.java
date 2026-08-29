package BasicMath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ApSeries {
    public static void show(int n,int a,int d)
    {
        int t;
        System.out.println("The AP series is: ");
        for(int i=1;i<=n;i++)
        {
            t=a+(i-1)*d;
            System.out.print(t+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n=sc.nextInt();
        System.out.println("Enter the first term: ");
        int a=sc.nextInt();
        System.out.println("Enter the common difference: ");
        int d=sc.nextInt();
        show(n,a,d);
    }
}
