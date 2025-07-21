package Must_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> Duplicates(int nums[]){
      HashSet<Integer> set = new HashSet<>();
      List<Integer> list = new ArrayList<>();
      for(int i = 0; i<nums.length;i++){
    
        if(!set.add(nums[i])){
            list.add(nums[i]);
        }
      }
      return list;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,5,6,4,3,2,8,9};
        System.out.println(Duplicates(nums));
    }
}
