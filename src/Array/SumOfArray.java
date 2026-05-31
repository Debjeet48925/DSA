package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,11,12,13,14};
        int sum=0;
        //Sum using for loop
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum="+sum);
    }
}
