public class SolidRhombus {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            //spaces
            //alternate way is j=1,j<=n-i;j++ 
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            //five stars
            for(j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
