package Array;
import java.util.*;
public class SecondLargest {
    public static int Second_Largest_element(int[] arr)
    {
        int seclarge=-1;
        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                seclarge=arr[i];
                break;
            }
        }
        return seclarge;
    }
    public static void main(String[] args) {
        int[] arr={1,8,7,56,90};
        int ans=Second_Largest_element(arr);
        System.out.println("The Second largest element of the array is:"+ans);
    }
}
