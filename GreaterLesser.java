import java.util.*;
public class GreaterLesser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m=sc.nextInt();
        System.out.println("Enter n");
        int n=sc.nextInt();
        if(m==n)
        {
            System.out.println("Equal");
        }
        else if(m>n)
        {
            System.out.println("m is greater");
        }
        else
        {
            System.out.println("n is greater");
        }
    }
}
