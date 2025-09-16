package DAY8.DSA;

// KADANES 


import java.util.*;

public class kadans{

public static void kadanes(int number[]){ //this is user defined function

int ms = Integer.MIN_VALUE;

int cs = 0;



for (int i=0; i <number.length ; i++){//u have to number in all places so while defineing its self remember and give simple and 1 

cs = cs + number[i];

if(cs< 0){  //here for if i forgot to give braces ,and for loop also so remember to give braces 

cs = 0;

}

ms= Math.max(cs,ms);

}



System.out.println("our max sum is :" + ms);



}

public static void main(String args[]){

    int number[] = { -2,-3,4,-1,-2,1,5,-3}; //kadans i gave instead of int so it can not be converted to a variable error occured 

   kadanes(number);//here i am calling my function which i created and arguments i hae defined here only calling that with int data type 

}

  }