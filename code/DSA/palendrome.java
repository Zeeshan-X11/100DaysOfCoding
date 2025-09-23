package STRINGS;

public class palendrome {
    public static boolean ispalendrome(String str){
    
    for (int i=0; i<str.length()/2; i++){
        int n = str.length();
        if( str.charAt(i) != str.charAt(n-1-i)){
            //not a plaendrome
            return false;
        }
    }
     return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(ispalendrome(str));
    }
}
