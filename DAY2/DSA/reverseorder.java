package DAY2.DSA;

//print digits of a number in reverse order

     import java.util.*;
  public class reverseorder {
  
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
       while(n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit + " ");
    
        n=n/10;
        
       }
            System.out.println();
        }
    }
