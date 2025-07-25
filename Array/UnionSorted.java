import java.util.ArrayList;

public class UnionSorted {
    public static ArrayList<Integer> union(int nums1[], int nums2[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while(i<n && j<m){ 
            // remove(skip) duplicates from nums1
            if(i>0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }
            // remove(skip) duplicates from num2
            if(j>0 && nums2[j] == nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]) {
                list.add(nums2[j]);
                j++;
            }
            else{
                  
               list.add(nums1[i]);
               i++;
               j++;
            
            }
   
        }
        while(i<n){
            // remove(skip) duplicates from nums1
            if(i>0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }
            list.add(nums1[i]);
            i++;
        }
        while(j<m){
             // remove(skip) duplicates from num2
                if(j>0 && nums2[j] == nums2[j-1]){
                j++;
                continue;
            }
            list.add(nums2[j]);
            j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5};
        int nums2[]  = {1,2,7};
        System.out.println(union(nums1, nums2));
    }
}
