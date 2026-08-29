package Array;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Case-1=>n given n elements
        System.out.println("Enter the length of an array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
