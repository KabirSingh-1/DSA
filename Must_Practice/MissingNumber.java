package Must_Practice;

public class MissingNumber {
    public static int missing(int nums[]){
        int n = nums.length;
        int total = n*(n+1)/2;
        int sum = 0;

        for(int num : nums){
            sum+=num;
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int nums[] = {0,2,3,1,4};
        System.out.println(missing(nums));
    }
}
