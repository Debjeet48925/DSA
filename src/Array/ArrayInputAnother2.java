package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInputAnother2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Size not known
        //logic->Array starting String
        String input=sc.nextLine();
        if(input.startsWith("[") && input.endsWith("]"))
        {
            input=input.substring(1,input.length()-1);
        }
        String num[]=input.split(" ");
        ArrayList<Integer> arr=new ArrayList<>();//Dynamic Array(Size is not fixed)
        //'1'->1
        for(String token:num)
        {
            int n = Integer.parseInt(token);
            arr.add(n);
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
