import java.util.*;
public class SumOfNat {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int sum=0;
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural numbers is "+sum);
    }
}
