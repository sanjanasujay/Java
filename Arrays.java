import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] marks = new int[3];
        //or
        int arr[] = new int[3];
        //or
        int arra[] = { 1, 2, 3};
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 100;
        System.out.println(marks); //prints garbage value which is memory location of array
        System.out.println(marks[0]); //prints 97
        System.out.println(marks[1]); // prints 98
        System.out.println(marks[2]); // prints 100

        System.out.println();
        //simple
        for(int i=0; i<3; i++)
        {
            System.out.println(marks[i]);
            //all 3 prints
        }


        //input size from user
        System.out.println("Enter size simple");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println();
        //input eacgh value from user
        System.out.println("Enter size for arr");
        int siz = sc.nextInt();
        int num[] = new int[siz];
        System.out.println("Enter vals");
        for(int i=0;i<siz;i++)
        {
             num[i] = sc.nextInt();
        }
        for(int i=0;i<siz;i++)
        {
            System.out.println(num[i]);
        }
       
    }
}
