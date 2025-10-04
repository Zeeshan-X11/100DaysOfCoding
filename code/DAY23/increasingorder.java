package RECURSSION.REC1;


public class increasingorder{
    public static void printDec(int n){
        if(n==1){                       //this base case is most imp , if u dont give it give stack over flow error and run infinitly
            System.out.print(n);  
            return;
        }
         printDec(n-1);
        System.out.print(n + " ");
        
    }
    public static void main(String args[]){
        int n=5;
        printDec(n);//calling 
    }
}