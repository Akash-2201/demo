package sjb.timecomplexity;

public class BinarySearch {

    public int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1; // Element not found
    }

    // Main method for testing
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = bs.binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
