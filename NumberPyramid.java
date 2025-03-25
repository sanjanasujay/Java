public class NumberPyramid {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            //spaces
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }

            //numbers - row 1, 1 , row 2, 2 times 2 is printed etc so row number and space
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
