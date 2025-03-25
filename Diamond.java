public class Diamond {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            //or instead of these two loops for stars, you can also do
            //for(j=1;j<=2*i-1;j++
            //(2*i-1) because 1,3,5,7 stars


            System.out.println();
        }

        //lower half
        for(i=n;i>=1;i--)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
