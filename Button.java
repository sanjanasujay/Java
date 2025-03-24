import java.util.*;
public class Button {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter choice of 1 2 or 3");
       int choice =sc.nextInt();
       switch(choice)
       {
        case 1:
        
            System.out.println("1 is HEllo");
            break;
       
        case 2:
       
            System.out.println("2 is namaste");
            break;
      
        case 3:
       
            System.out.println("3 is Bonjour");
            break;
       
        default:
       
            System.out.println("Invalid choice");
        
       }
      
    }
}
 
    
