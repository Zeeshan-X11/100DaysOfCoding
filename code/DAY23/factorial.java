package DAY23;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main (String args[]){
        int n=5;
       System.out.println(fact(n));
    }
}
//tc = 0(n),space even we dint use variable but it eat memory space/stack space n var 