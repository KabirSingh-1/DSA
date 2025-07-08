//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
public class FirstMissingPositive {
    public static int MissingPositive(int nums[]){
        int result = 1;
        for(int num:nums){
            if(num == result){
                result++;
            }
            if(num>result)break;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {7,8,9,11,12};
        System.out.println(MissingPositive(nums));
    }
}
