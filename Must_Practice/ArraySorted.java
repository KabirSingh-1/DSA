package Must_Practice;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + isArraySorted(arr));

        int[] unsortedArr = {5, 3, 4, 1, 2};
        System.out.println("Is the unsorted array sorted? " + isArraySorted(unsortedArr));
    }

    public static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
