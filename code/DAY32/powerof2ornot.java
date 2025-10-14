package DAY32;

public class powerof2ornot {
    public static boolean ispoweroftwo(int n ){
        return (n&(n-1)) == 0;            //15&16 or 3&4
    }

    public static void main(String args[]){
        System.out.println(ispoweroftwo(15));
    }
}

-