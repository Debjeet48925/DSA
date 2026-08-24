package Array;

import java.util.Scanner;

public class ArrayProg02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the no. for the index= "+i);
            int data=sc.nextInt();
            arr[i]=data;
        }
      display(arr);
    }

    public static void display(int[] arr)
    {
        //for each loop
         for(int a:arr)
         {
             System.out.println(a);
         }
    }
}
