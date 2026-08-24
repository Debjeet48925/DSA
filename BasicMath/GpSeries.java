package BasicMath;

import java.util.Scanner;

public class GpSeries {
    public static void show(int n,int a,int r)
    {

        System.out.println("The GP series is: ");
        System.out.print(a+" ");
        for(int i=1;i<n;i++)
        {
            a=a*r;
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the first term: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the common Ratio: ");
        int r=sc.nextInt();
        sc.nextLine();
        show(n,a,r);
        sc.close();
    }
}
