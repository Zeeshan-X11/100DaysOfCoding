package DAY2.DSA;
import java.util.*;
public class primerange{


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
