
public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,1,12};

        int i = 0; 
        for(int j = 1; j<nums.length; j++){
            if(nums[j]!=0){
                
                //(using xor)
                // if(i!=j){
                //     nums[j] = nums[j]^nums[i];
                //     nums[i] = nums[j]^nums[i];
                //     nums[j] = nums[j]^nums[i];
                // }

                //(using temp variable)
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        for(int j= 0; j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }
    }
}
