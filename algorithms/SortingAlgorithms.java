package algorithms;

import java.util.Arrays;

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
        for (int pos = 0; pos < arr.length - 1; pos++) {
            int smallest = pos;
            for (int n = pos + 1; n < arr.length; n++) {
                if (arr[n] < arr[smallest]) {
                    smallest = n;
                }
            }
            swapTwoNumbers(arr, pos, smallest);
        }
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
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] a = Arrays.copyOfRange(arr, 0, mid);
        int[] b = Arrays.copyOfRange(arr, mid, arr.length);
        
        mergeSort(a);
        mergeSort(b);
        merge(arr, a, b);
    }

    //Quick Sort
    //Heap Sort
    //Radix Sort
    public static void radixSort(int[] arr) {
        
        String[] stringArr = new String[arr.length];

        //Turn everything to a string
        for (int n = 0; n < arr.length; n++) {
            stringArr[n] = String.valueOf(arr[n]);
        }

        
        //Find the longest string
        int longest = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() > longest) {
                longest = stringArr[i].length();
            }
        }
        
        //Pad the strings with leading zeros
        for (int x = 0; x < stringArr.length; x++) {
            while (stringArr[x].length() < longest) {
                stringArr[x] = "0" + stringArr[x];
            }
        }
        
        for (int f = longest - 1; f >=0; f--) {
            for (int w = 0; w < stringArr.length-1; w++) {
                while (stringArr[w].charAt(f) > stringArr[w+1].charAt(f)) {
                    String temp = stringArr[w];
                    stringArr[w] = stringArr[w+1];
                    stringArr[w+1] = temp;
                }
            }
        }

        System.out.println("Radix Sort:");
        for (int n = 0; n < stringArr.length; n++) {
            System.out.print(stringArr[n] + " ");
        }
        System.out.println();
    }


    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0; 
        int j = 0; 
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    private static void swapTwoNumbers(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}