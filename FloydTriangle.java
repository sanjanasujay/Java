public class FloydTriangle {
    public static void main(String[] args) {
        int i,j,c;
        c=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                c++;
                System.out.print(+c+" ");
            }
            System.out.println();
        }
    }
}
