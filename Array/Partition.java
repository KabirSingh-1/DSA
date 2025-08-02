import java.util.ArrayList;
import java.util.Scanner;

public class Partition {
    static int[] partition(int nums[], int pivot){
      int left = 0;
      int mid = 0;
      int right = nums.length-1;
      while (mid<=right) {
        if(nums[mid]<pivot){
            int temp = nums[left];
            nums[left] = nums[mid];
            nums[mid] = temp;
            left++;
            mid++;
        }
        else if(nums[mid] == pivot){
            mid++;
        }
        else{
            int temp = nums[mid];
            nums[mid] = nums[right];
            nums[right] = temp;
            right--;
        }
      }
      return nums;
    }
    static void pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int num : nums){
            if(num<pivot){
                less.add(num);
            }
            else if(num>pivot){
                greater.add(num);
            }
            else{
                equal.add(num);
            }
        }
            int arr[] = new int[n];
            int i = 0;
            for(int num : less) arr[i++] = num;
            for(int num : equal) arr[i++] = num;
            for(int num : greater) arr[i++] = num;
            for(int num : arr){
              System.out.print(num+" ");
            }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int nums[] =new int[n];
       for(int i =0; i<n; i++){
        nums[i] = sc.nextInt();
       } 
       int pivot = sc.nextInt();
       int arr[] = nums.clone();
       partition(nums, pivot);
       for(int num : nums ){
        System.out.print(num+" ");
       }
       System.out.println();
       pivotArray(arr, pivot);
    }
}
