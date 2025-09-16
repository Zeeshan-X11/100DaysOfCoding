package DAY4.DSA;


import java.util.*;

public class starpattren{
    public static void main(String args[]){
   
   for (int i =0;i<=10;i++){   //n-i+1
    for (int j=0;j<=i;j++){
          System.out.print("*");   //  System.out.println(i + " * " + j + " = " + (i * j));  

    }
    System.out.println();  // this will print the next line after printing all the stars in one line
   }
}
}