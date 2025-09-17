package DAY10.DSA;

//m = colums ,n = rows 

import java.util.*;
public class matrix{
    public static void main(String args[]){
     int matrix[][] = new int[3][3];
     int n = matrix.length,m = matrix[0].length;

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements for 3x3 matrix");
     //inputt 
     for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();

        }
    }
//output
  System.out.println(" matrix is :");
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
    System.out.print(matrix[i][j] + " ");
        }
        System.out.println();

    }
}
}
