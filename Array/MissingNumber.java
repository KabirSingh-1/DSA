//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class MissingNumber {
    public static int Missing(int nums[]){
        int n = nums.length;
        int total = (n)*(n+1)/2;
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(" missing number "+Missing(nums));
    }
}
