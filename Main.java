import algorithms.SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = { 1, 230, 11, 13, 50, 60, 45, 0, 20, 59};
        SortingAlgorithms.radixSort(arr);
        
        System.out.println("Radix Sort:");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }

}
