package DAY20;
import java.util.Arrays;

public class inbuildsort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};

        // ascending order
        Arrays.sort(arr);

        // for descending order
        // Arrays.sort(arr, Collections.reverseOrder()); --> works only for Integer[], not int[]

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
