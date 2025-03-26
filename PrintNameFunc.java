import java.util.*;
public class PrintNameFunc {
    public static void printMyName(String name)
    {
        System.out.println(name);
        return; 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name:");
        String s = sc.next();
       
        printMyName(s);
    }
    
}
