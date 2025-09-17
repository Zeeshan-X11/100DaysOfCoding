package DAY6.DSA;

import java.util.Arrays;
import java.util.Comparator;

public class customorder {
    public static void main(String[] args) {
        String[] names = {"Zeeshan", "Ali", "Rahul", "Meena"};
        
        // Sort in reverse (descending) order
        Arrays.sort(names, Comparator.reverseOrder());
        
        System.out.println(Arrays.toString(names));
    }
}
