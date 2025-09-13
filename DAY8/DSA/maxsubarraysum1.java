package DAY8.DSA;


  import java.util.*;
  public class maxsubarraysum1{
    public static void maxSubarraysum(int number[]){
        int currSum =0 ; //dont forget to put int 
        int maxsum = Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++){

      for (int j=i;j<number.length;j++){

         for(int k=i; k<j; k++){
            //subbarray sum

            currSum += number[k];

         } 
    System.out.println(currSum);
         if (maxsum < currSum);{
         maxsum = currSum;
        }

         
    }

  }

System.out.println("max sum is " + maxsum);
  }
public static void main(String args[]){
    int number[] = { 2,1,-6,5};
    maxSubarraysum(number);
}
  }

  