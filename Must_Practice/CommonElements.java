package Must_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static Integer[] Common(Integer nums1[], Integer nums2[]){
        Set<Integer> set = new HashSet<>(Arrays.asList(nums1));
        Set<Integer> commonSet = new HashSet<>();
        for(Integer num : nums2){
            if(set.contains(num)){
                commonSet.add(num);
            }
        }
        return commonSet.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        Integer nums1[] = {1,2,3,4,5,6,7};
        Integer nums2[] = {4,5,6};
        Integer[] common = Common(nums1, nums2);
        System.out.println(Arrays.toString(common));
    }
}
