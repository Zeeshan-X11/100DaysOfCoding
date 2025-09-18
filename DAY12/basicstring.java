package STRINGS;
//BASIC
/*import java.util.*;
public class basic{
    public static void main(String args[]){
        char arr[] = {'a','b','c'};
        String str ="abcd";
        String srt2 = new String("xyz");


        //Strings are immutable 
 THAT MEANS U NEVER make changes in string if u r changing then a new string wiol be created the current sting wont be chaneged 
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();   only single word  if space comes it wont take only a single word it will take 
         name = sc.nextLine();//takes whole line 
        System.out.println(name);


    }

}
//CONCATENATION
import java.util.*;
public class basic{
    public static void main(String args[]){
        //String fulName = " Tony Stark";
        //System.out.println(fulName.length());  //here put ()becz this is function 
    
    //concatination "+"

    String firstName = "zee";
    String lastname = "shan";
    String fulname = firstName + "  " +lastname;
    System.out.println(fulname);
    
    
    
    
        }


}
*/
//LENTH(),charAt()
//full sys.out.println(fullname.length());  
//u hv to give this () additional to get the length
//.charAt(index)//and we will get the value
//VARITY OF PROBLEMS  

import java.util.*;
public class basicstring{
    
    // Method to print each letter of a string
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {  //put the condetion over here 
            System.out.print(str.charAt(i) + " ");  // print with space
        }
        System.out.println(); // new line after loop
    }

    public static void main(String args[]) {
        String str = "abcd";

        // Test the function
        printLetters(str);
    }
}
//u can solve  ovels problems and others ,else smtg else print specified thing

