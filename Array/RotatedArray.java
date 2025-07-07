public class RotatedArray {
    public static void rotateArray(int nums[],int k){
       int n = nums.length;
       k = k%n;
       reverse(nums, 0, n-1);
       reverse(nums, 0, k-1);
       reverse(nums, k, n-1);

       for(int i = 0; i<n; i++){
        System.out.print(nums[i]+" ");
       }
    }
    public static int[] reverse(int nums[],int left,int right){

        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        rotateArray(nums, 3);
    }
}
