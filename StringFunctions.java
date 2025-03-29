public class StringFunctions {
    
public static void main(String[] args) {
      
       String fname = "Satya";
       String lname = "Narayana";
       String fullName = fname + " " +lname;
       System.out.println(fullName);
     //SatyaNarayana
     //The plus is concatinating

     //length
    System.out.println(fullName.length());

    //charAt
    for(int i=0;i<fullName.length();i++)
    {
        System.out.println(fullName.charAt(i));
    }

    //compare
    String name1 = "tony";
    String name2 = "tony";


    // s1.compareTo(s2)
    //1 s1 > s2 : +ve value
    //2 s1 == s2 : 0
    //3 s1 < s2 : -ve value

    //hello wello
    //If u compare hello and wello, only h and w is different. W's value is higher than H's value so hello will be < (less than) wello.

    // alphabets are big like high value
    //numbers small
    //special characters smallest
    if(name1.compareTo(name2)==0)
    {
        System.out.println("Strings are equal");
    }
    else if(name1.compareTo(name2)>0){
        System.out.println("name 1 big");
    }
    else
    {
        System.out.println("name 2 big");
    }


    //What if we do '==' instead of compareTo
    if(name1==name2)
    {
        System.out.println("Strings are equal");
    }
   else
    {
        System.out.println("Strings are not equal");
    }
    //It will work now but it fails in many test cases


    //SUBSTRING
    String sentence="My name is Hari";
    //substring(start index, end index)
    String hesru = sentence.substring(11,sentence.length());
    System.out.println(hesru);
    //Output : Hari

    System.out.println(sentence.substring(8,14));
    //Op: is Har
    //14th index is skipped
    
    System.out.println(sentence.substring(8,15));
    //Op: is Hari

    //so lets try
    System.out.println(sentence.substring(2));
    //Op name is Hari

//STRINGS ARE IMMUTBALE
// U CANT EDIT STRINGS ONCE IT HAS BEEN STORED IN MEMORY

}}