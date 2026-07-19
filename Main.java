import algorithms.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = { 1, 23, 11, 13, 5, 6, 45, 0, 2, 59};
        SortingAlgorithms.mergeSort(arr);
        
        System.out.println("Merge Sort:");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }

}
