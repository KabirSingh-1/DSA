package Must_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindPairs {
    public static List<int[]> Pair(int nums[], int target){
        List<int[]> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int m = target-nums[i];
            if(set.contains(m)){
                list.add(new int[]{m,nums[i]});
            }
            set.add(nums[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 3, 5, 6, -2, 8, 7, 1};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        List<int[]> pair = Pair(nums, target);
        for(int[] arr : pair){
            System.out.println("{"+arr[0]+","+arr[1]+"}");
        }
        sc.close();
    }
}
