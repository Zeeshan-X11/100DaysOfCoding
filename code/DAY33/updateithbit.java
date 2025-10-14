package BITMANULULATION;

public class updateithbit {
     
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n| bitmask;

    } 
     public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
}



public static int updatebit(int n,int i,int newbit){

    //or solution 
   /*  if(newbit==0){
        return clearithbit(n,i);

    }else{
        return setithbit(n,i);
    }
    */


 n = clearithbit(n,i);
    int bitmask = newbit<<i;
    return n |bitmask;
}
public static void main(String args[]){
    System.out.println(updatebit(10,2,1));
}
}
//inerviewer can ask a bit twisted questions , in standard questions 
//he might say update ith bit with out calling these set and clear but u hv first clear the bit 