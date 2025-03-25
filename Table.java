import java.util.*;
public class Table {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int m=0;
        for(i=0;i<=n;i++)
        {
            m=n*i;
            System.out.println(n+"x"+i+"="+m);
        }
       
    }
}
