package DAY25;

public class sumfirstnaturalnumbers {
    public static int calcsum(int n){
        if(n == 0){
            return 1;
        }
        int snm1 = calcsum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println( calcsum(n));
    }
}
