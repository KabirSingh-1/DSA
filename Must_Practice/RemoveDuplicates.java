package Must_Practice;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static HashSet<Integer> dublicate(int nums[]){
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums){
            if(!hash.contains(num)){
                hash.add(num);
            }
        }

       return hash;
    }
    // assume if array is sorted
    public static int dublicate1(int nums[]){
        Arrays.sort(nums);
        int i = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,7,2,1,4,5};
        System.out.println(dublicate(nums));
        System.out.println(dublicate1(nums));
    }
}
