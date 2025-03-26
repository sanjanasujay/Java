import java.util.*;
public class SumOfTwo {
    public static int Calsum(int a, int b)
    {
        int s = a + b;
        return s; 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int s = Calsum(a, b);
        System.out.println("Sum is: "+s);
    }
    
}
