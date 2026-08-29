package Pattern_Problems;

public class Solid_Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
