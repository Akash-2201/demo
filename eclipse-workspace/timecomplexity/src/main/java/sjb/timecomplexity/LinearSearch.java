package sjb.timecomplexity;
public class LinearSearch{

    public int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; 
    }

 
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();

        int[] arr = {10, 20, 30, 40, 50};
        int elementToFind = 30;

        int index = ls.linearSearch(arr, elementToFind);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
