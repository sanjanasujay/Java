public class RotatePyramid {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        for(i=1;i<=n;i++)
        {
            //inner loop space
            for(j=1;j<=n-i;j++)
            {
               System.out.print(" ");
            }
            //inner loop star
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
