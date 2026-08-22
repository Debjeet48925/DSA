package Array;
import java.util.*;
public class RotateLeftByOne {
    public static void left_rotate_one(int[] arr)
    {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an Array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        left_rotate_one(arr);
        System.out.println("After left rotate by one:");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        sc.close();
    }
}
