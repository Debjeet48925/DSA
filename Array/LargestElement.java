package Array;
import java.util.*;

public class LargestElement {
    public static int Largest_element(int[] arr)
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] arr={1,8,7,56,90};
        int ans=Largest_element(arr);
        System.out.println("The largest element of the array is:"+ans);
    }
}
