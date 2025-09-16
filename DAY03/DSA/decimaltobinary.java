package DAY3.DSA;
public class decimaltobinary{
public static void decimaltobinary(int n){
    int myNum =n;                //case sensitive i wrote samll n 
    int pow =0;
    int decNum=0;
    int binNum = 0;                //before declaring we have to write here binNum
   while(n > 0){
    int rem = n % 2;
    binNum = binNum + (rem *(int) Math.pow(10,pow));  //int for type caste
    pow++;
    n = n/2;
   }
   System.out.println("binary form of " + myNum + " = " + binNum);
   }

   public static void main(String args[]){
    decimaltobinary(10);
   }
}

