import java.util.HashMap;
import java.util.Scanner;
public class ContiguousArray {
    
    public static int findLength(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum =0;
        int maxLength = 0;


        for(int i = 0; i<nums.length; i++){
            sum+=(nums[i] == 0)?-1:1;
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength,i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]  = new int[n];
        for(int i =  0; i<n; i++){
            nums[i] = sc.nextInt();
        }
         
        int results = findLength(nums);
        System.out.println("MaxLength: "+results);
        
    }
}


// logic keep in mind 
// Input: [0, 1, 0, 1, 1]
// Converted: [-1, 1, -1, 1, 1]
// Prefix sums: [0, -1, 0, -1, 0, 1]
