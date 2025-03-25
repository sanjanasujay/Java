import java.util.*;
public class Age {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age");
       int age = sc.nextInt();
       if(age>=18)
       {
        System.out.print("You are an adult");
       }
       else{
        System.out.print("You are a minor");
       }
    }
}
