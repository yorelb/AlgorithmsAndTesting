import algorithms.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = { 12, 11, 13, 5, 6 };
        SortingAlgorithms.bubbleSort(arr);
        
        System.out.println("Bubble Sort:");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }

}
