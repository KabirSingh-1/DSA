package HashTables;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
              int j = map.get(nums[i]);
              if(i-j<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3,1};
        boolean result = containsNearbyDuplicate(nums, 3);
        System.out.println(result);
    }
}
