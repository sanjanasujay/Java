public class PalindromePattern {
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

            //number 1st half
            for(j=i;j>=1;j--)
            {
                System.out.print(+j);
            }
            
            //number 2nd half
            for(j=2;j<=i;j++)
            {
                System.out.print(+j);
            }

            System.out.println();
        
        }
    }
}
