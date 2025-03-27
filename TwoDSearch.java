
import java.util.*;
public class TwoDSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and m");
        int r= sc.nextInt();
        int c= sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter "+(r*c)+" vals");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter number to search: ");
        int x=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.println("X is found at loc: "+i+","+j);
                }
            }
        }


    }
}
