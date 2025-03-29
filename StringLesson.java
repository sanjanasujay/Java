import java.util.Scanner;

public class StringLesson {
    public static void main(String[] args) {
        //String declaration
      //  String name="sanjana";
      //  String sent="How are you?";

        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter your name ");
        //for one word input its next
        String name = sc.next();
        System.out.println("Your name is "+name);
        //for input of long sentence with many words use sc.nextLine();

        
    }
}
