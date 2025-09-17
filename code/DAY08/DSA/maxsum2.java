package DAY8.DSA;

  //MAX SUBARAY 2ND APPROACH 

  //Maximum subarray sum

  import java.util.*;
  public class maxsum2{
    public static void maxSubarraysum(int number[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int [number.length];
        prefix[0] = number[0];
  //calculate prefix sum   
        for(int i=1; i<prefix.length;i++){  //u r forgetting int 
        prefix[i]=  prefix[i-1] + number[i]; 

    }
    
    for(int i=0; i<number.length; i++){
        int start = 1;
      for (int j=i;j<number.length;j++){
        int end = j;

        currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
       if (maxsum < currSum){
         maxsum = currSum;
          
         } 
    }

  }

System.out.println("max sum is " + maxsum);
  }
public static void main(String args[]){
    int number[] = { 2,1,-6,8};
    maxSubarraysum(number);
}
  }