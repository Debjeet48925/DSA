package Array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(1,30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(arr);
        System.out.println(arr.contains(40));//false
        System.out.println(arr.remove(1));
        System.out.println(arr);
        System.out.println(arr.remove(Integer.valueOf(40)));
        System.out.println(arr);
    }
}
