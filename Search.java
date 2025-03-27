import java.util.*;
public class Search {
    //Linear Search

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for array");
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        System.out.println("Enter vals");
        for(int i=0;i<size;i++)
        {
             num[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search");
        int x = sc.nextInt();

        for(int i=0;i<num.length;i++)
        {
            if(num[i]==x)
            {
                System.out.println("x found at index "+i);
            }
            
        }

       
    }


}
