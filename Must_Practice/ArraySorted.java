package Must_Practice;

public class ArraySorted {
    // sort array without Arrays.sort() function 
    public static int[] SortArray(int nums[]){
        int n = nums.length;
        boolean swapped;
        for(int i = 0; i<n; i++){
            swapped = false;
            for(int j = 0; j<n-i-1; j++){
              if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
              }
              swapped = true;

            }
            if(!swapped){
                break;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted? " + isArraySorted(arr));

        int[] unsortedArr = {5, 3, 4, 1, 2};
        System.out.println("Is the unsorted array sorted? " + isArraySorted(unsortedArr));

        int nums[] =  {64, 34, 25, 12, 22, 11, 90};
        SortArray(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
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
