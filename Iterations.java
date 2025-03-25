public class Iterations {
    public static void main(String[] args) {
        int c;
        //for loop
        for(c=0;c<11;c++)
        {
            System.out.println("For loop  "+c);
        }

        //while loop
        int i=0;
        while(i<11)
        {
            System.out.println("While loop  "+i);
            i++;
        }

        //do while
        int j=0;
        do {
            System.err.println("Do while loop  "+j);
            j++;
        } while (j<11);
    }
}
