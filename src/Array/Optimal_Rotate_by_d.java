package Array;

import java.util.Scanner;

public class Optimal_Rotate_by_d {
    public static void reverse(int[] arr,int l,int r)
    {
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void rotate(int[] arr,int d)
    {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("After rotation by k:");
        for (int a:arr)
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
