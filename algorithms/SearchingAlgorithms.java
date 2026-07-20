package algorithms;

public class SearchingAlgorithms {

    public static boolean  linearSearch(int[] arr, int target) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == target) {
                return true;
            }
        }
        return false;
    }

}
