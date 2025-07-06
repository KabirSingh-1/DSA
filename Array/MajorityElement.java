

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    // by HashMap
    public static int ByHashmap(int nums[],int majority,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>majority){
                return nums[i];
            }
        }
        return -1;

        
    }
    //  (use another helper function count)
    public static int byCountEvery(int nums[], int majority,int n){
        for(int i = 0; i<n; i++){
            if(count(nums, nums[i])>majority){
                return nums[i];
            }
        }
       return -1;
    }
    public static int count(int nums[], int key){
       int c = 0;
       int n = nums.length;
       for(int i = 0; i<n; i++){
          if(nums[i] == key){
            c++;
          }
       }
       return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int majority = n/2;
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Majority element: "+ByHashmap(nums, majority, n));
        System.out.println("by count by every: "+byCountEvery(nums, majority, n));
    }
}
