package DAY26;

public class clearbitsinrange {
    public static int clearibitsinrange(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearibitsinrange(10,2,4));
    }

    }

//IN THIS topicbits the program is less bit the logic is where to apply the right this imp