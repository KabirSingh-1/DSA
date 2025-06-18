import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    static int[] two(int[] nums, int n, int target ){


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int m = target- nums[i];

            if(map.containsKey(m)){
                return new int[]{map.get(m),i};
            }
            else{
                map.put(nums[i], i);
            }
        }

        // for(int i  = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
          nums[i] = sc.nextInt();
        }

       int[] result =  two(nums, n, target);
        for(int i = 0; i<2; i++){
           System.out.println("Index: "+result[i]);
        }
    }
}