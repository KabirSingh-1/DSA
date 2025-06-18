import java.util.Scanner;

public class moveZeros {

    public static int[] movezeros(int nums[]){
        int i = 0;

        for(int j = 0; j<nums.length; j++){
            if(nums[j]!=0){
                if(i!=j){
                    nums[j]= nums[j]^nums[i];
                    nums[i]= nums[j]^nums[i];
                    nums[j]= nums[j]^nums[i];
                }
                i++;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int result[] = movezeros(nums);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}