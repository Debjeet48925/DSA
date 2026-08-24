package Array;
import java.util.*;
public class ReverseArray {

    public static int[] reverse(int[] arr)
    {
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
           int temp=arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] num=reverse(arr);
        for(int a:num)
        {
            System.out.print(a+" ");
        }
        sc.close();
    }
}
