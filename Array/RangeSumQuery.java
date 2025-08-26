class NumArray {
    int[] prefixSum;

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}


public class RangeSumQuery {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        
        // Create NumArray object
        NumArray obj = new NumArray(nums);
        
        // Call sumRange on different ranges and print results
        System.out.println("sumRange(0, 2): " + obj.sumRange(0, 2)); // Output: 1

        System.out.println("sumRange(2, 5): " + obj.sumRange(2, 5)); // Output: -1
        
        System.out.println("sumRange(0, 5): " + obj.sumRange(0, 5)); // Output: -3
    }
}

