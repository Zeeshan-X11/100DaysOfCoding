package DAY18;

public class stringbuilder {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch <= 'z' ; ch++){
            sb.append(ch);
        }//abcde.. //O(n)=26
        //if not sbuilder then 26 x n.lenght
  
    System.out.println(sb);
}

}

//string builder becz effecency increases 

