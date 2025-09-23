package SORTING;
public class bubbblesort{
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) { // total n-1 turns
            for (int j = 0; j < arr.length - 1 - turn; j++) { // compare till last unsorted
                if (arr[j] > arr[j + 1]) { // swap if greater
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);

        // printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
