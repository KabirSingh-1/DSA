package Must_Practice;

public class SecondLargest {
    public static int secondLargest(int nums[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for( int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i]>secondMax && nums[i]!=max){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(secondLargest(nums));
    }
}
