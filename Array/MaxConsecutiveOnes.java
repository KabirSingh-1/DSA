public class  MaxConsecutiveOnes {
     static int maxOne(int nums[]){
        int count = 0, max = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
     }
     
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxOne(nums));
    }
}

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
