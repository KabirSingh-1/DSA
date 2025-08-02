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
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int nums[] =new int[n];
       for(int i =0; i<n; i++){
        nums[i] = sc.nextInt();
       } 
       int pivot = sc.nextInt();
       partition(nums, pivot);
       for(int num : nums ){
        System.out.print(num+" ");
       }
    }
}
