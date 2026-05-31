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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,55,10,20,3,4};
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int ans=Linear_search(arr,target);
        System.out.println(ans);
    }
}
