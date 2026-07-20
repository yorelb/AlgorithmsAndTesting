package algorithms;

public class SearchingAlgorithms {

//Linear search 
    public static boolean linearSearch(int[] arr, int target) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == target) {
                return true;
            }
        }
        return false;
    }

//Binary search
    

}
