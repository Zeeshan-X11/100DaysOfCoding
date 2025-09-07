package DAY5.DSA;

/*
//METHODS IN JAVA
//METHODS ARE ALSO KNOWN AS FUNCTIONS

import java.util.*;
public class basic{
public static void swap(int a ,int b){

    int temp = a;
     a =  b ;
     b = temp;
System.out.println("a = " + a);  //if u write here onlu it will swape
System.out.println("b = " + b);
}
public static void main(String args[]){
    int a =5;
    int b = 6;
   swap(a,b);
   
System.out.println("a = " + a);  if u write this here then u it wont get swaped becz of call stack 
System.out.println("b = " + b);

}
}


//METHODS IN JAVA

import java.util.*;
 public class basic{
  public static int multiply(){
        int a=4;
        int b = 5;
int product=a*b;
 return product;
    }
   public static void main (String args[]){
int prod = multiply();
    System.out.println(prod);

   }
}//this is a class variable so
 

 -------------------------------------------------------------------------------------------------------------------


//FACTORIAL AND BIONOMIAL COEFFICIENT

import java.util.*;
public class basic{
 public static int factorial (int n){
    int f=1;
for( int i=1;i<=n;i++){
    f = f *i;
 }
return f;
 }

 public static int binCoeff(int n,int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr = factorial(n-r);

    int binCoeff = fact_n /( fact_r * fact_nmr);  //one under score
    return binCoeff;

    
 }
public static void main(String args[]){
 System.out.println(binCoeff(5,2));
}

}



 -------------------------------------------------------------------------------------------------------------------

 
//for this code to excecute u need to remove first the above print statment  only one print  statement can exist

public static int sum(int a,int b){
    return a + b;                      
                                    //paramters  should be difrent i mean 2 or theree or else the data type of paramters should be diffrent not the data type outside u can give the smae name in the java function name 

}
public static int sum(int a,int b,int c){
    return a+b+c;
*/
      
//nly for n greater than 2 and can write if statment for 2 




/* 

 -------------------------------------------------------------------------------------------------------------------


//PRIME 


import java.util.*;
public class basic{


public static boolean isPrime(int n){
    if (n ==2 ){
        return true;
    }
    for (int i=2; i<=Math.sqrt(n);i++){
        if(n% i ==0   ){
            return false;
        }
    }

    return true;

}
public static void main(String args[]){
  System.out.println(isPrime(7));
}
}



// 
import java.util.*;
public class basic{


public static boolean isPrime(int n){
    boolean isPrime = true;
    for (int i=2 ;i<=n-1;i++){
        if(n % i ==0){
            isPrime = false;
            break ;
        
        }
    }

return isPrime;
}


public static void primeInRange(int a){
    for(int i=2; i<=a; i++){
        if(isPrime(i)){
            System.out.print(i+" ");

        }
    }
    System.out.println();
}

public static void main(String args[]){
    primeInRange(20);
}
}


*/