package DAY4.DSA;


import java.util.*;

public class invertedstarpattren{
    public static void main(String args[]){
   int n=7;
   for (int i =0;i<=n;i++){   
    for (int j=0;j<=n-i+1;j++){
          System.out.print("*");   //  System.out.println(i + " * " + j + " = " + (i * j));  

    }
    System.out.println();  // this will print the next line after printing all the stars in one line
   }
}
}
