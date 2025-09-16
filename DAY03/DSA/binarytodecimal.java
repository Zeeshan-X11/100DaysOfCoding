package DAY3.DSA;

import java.util.*;

public class binarytodecimal {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;  // get last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;  // remove last digit
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        binToDec(binNum);
    }
}
