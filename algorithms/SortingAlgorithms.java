package algorithms;

public class SortingAlgorithms {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int x = 0; x < arr.length - 1; x++) {
                if (arr[x] > arr[x+1]) {
                    swapTwoNumbers(arr, x, x+1);
                    swapped = true;
                }
            }   
        }
        while (swapped);
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {  
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int x = 1; x < arr.length; x++) {
            int current = x;
            int previous = x - 1;
            
            while (previous >= 0 && arr[current] < arr[previous]) {
                swapTwoNumbers(arr, current, previous);
                current--;
                previous--;
            }
        }
        
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {  
    }
    

    private static void swapTwoNumbers(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}