import java.util.HashSet;

public class RemoveDuplicates {
    public static int byHashSet(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int idx = 0;
        for(int i = 0; i<n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static int byTwoPointer(int nums[]){
       int idx = 0;
       for(int i = 0 ; i<nums.length; i++){
        if(nums[idx]!=nums[i]){
            nums[idx+1] = nums[i];
            idx++;

        }

       }
       return idx+1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};

        System.out.println("by Hash Set: "+byHashSet(nums));
        
        System.out.println("by Two Pointer: "+byTwoPointer(nums));
    }

}
