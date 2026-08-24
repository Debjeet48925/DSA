package Array;

import java.util.Scanner;

public class Rotate_by_d {
    public static void rotate(int[] arr,int d)
    {
        int n=arr.length;
        d=d%n;
        int []temp=new int[d+1];
        for(int i=0;i<=d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        int j=0;
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[j];
            j++;
        }
        System.out.println("After Rotation by K:");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("The elements of the array are:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of k:");
        int d=sc.nextInt();
        rotate(arr,d);
        sc.close();
    }
}
