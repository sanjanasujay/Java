public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int r=4;
        int i,j;
        for(i=1;i<=r;i++)
        {
            for(j=r;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
