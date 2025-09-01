package Must_Practice;

public class MergeTwoSortedArrays {
    public static int[] Merge(int nums1[], int nums2[]){
       int n = nums1.length;
       int m = nums2.length;
       int result[] = new int[n+m];
       int i = 0,j = 0,k =0;
       while(i<n && j<m){
        if(nums1[i]<=nums2[j]){
            result[k++] = nums1[i++];
        }else{
            result[k++] =nums2[j++];
        }
       }
       while (i<n) {
         result[k++] = nums1[i++];
       }
       while (j<m) {
         result[k++] = nums2[j++];
       }
       return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1,3,4,6,7};
        int nums2[] = {2,5,8,0,9};
        int result[] = Merge(nums1, nums2);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
