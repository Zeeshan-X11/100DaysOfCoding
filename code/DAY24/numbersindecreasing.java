package  DAY24;

public class numbersindecreasing {
    public static void printDec(int n){
        if(n==1){                       //this base case is most imp , if u dont give it give stack over flow error and run infinitly
            System.out.println(n);  
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        printDec(n);//calling 
    }
}
