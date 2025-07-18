package Must_Practice;

import java.util.HashSet;

public class RemoveDuplicates {
    public static HashSet<Integer> dublicate(int nums[]){
        HashSet<Integer> hash = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
            }
        }

       return hash;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,7,2,1,4,5};
        System.out.println(dublicate(nums));
    }
}
