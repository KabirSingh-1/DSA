// optimal kadan's algorithm
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = 0; 
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>max){
                max = Math.max(max, sum);

            }
            if(sum<0) sum = 0;
        }

        System.out.println(max);
    }
}

// also do brute force 


// public class MaximumSubarray {

//     public static void main(String[] args) {
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        
//         int max = Integer.MIN_VALUE;
        
//         for(int i = 0; i<nums.length; i++){
//           for(int j = i; j<nums.length; j++){
//             int sum = 0; 
//             for(int k = i; k<j; k++){
//                 sum+=nums[k];
//                   if(sum>max){
//                 max = Math.max(max, sum);

//             }
//             }
//           }
//         }

//         System.out.println(max);
//     }
// }


// best 

// public class MaximumSubarray {

//     public static void main(String[] args) {
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        
//         int max = Integer.MIN_VALUE;
        
//         for(int i = 0; i<nums.length; i++){
//             int sum = 0; 
//           for(int j = i; j<nums.length; j++){
//             sum+=nums[j];
//              if(sum>max){
//                 max = Math.max(max, sum);
//              }
//           }
//         }

//         System.out.println(max);
//     }
// }