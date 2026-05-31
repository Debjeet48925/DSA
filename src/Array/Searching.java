package Array;
import java.util.*;
public class Searching {
    public static int Linear_search(int[] arr,int target)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return index;
    }
    public static int binary_search(int []arr,int target)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e) {
//            int mid = (s + e) / 2;
            int mid=s+(e-s)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,52,64,78,99,106};
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int ans=binary_search(arr,target);
        System.out.println(ans);
    }
}
