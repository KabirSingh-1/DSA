public class ZeroFilledSubarray {
    public static long simple(int nums[]){
        long result = 0;
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                count = 0;
            }
            result+=count;
        }
        return result;
    }
    public static long ZeroFilled(int nums[]){
        long result = 0;
        int n = nums.length;
        int i = 0;
        while(i<n){
            long l = 0;
            if(nums[i] == 0){
                while(i<n && nums[i] ==0){
                    l++;
                    i++;
                }
            }
            else{
                i++;
            }
            result += (l)*(l+1)/2;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,0,0,2,0,0,4};
        long result = ZeroFilled(nums);
        System.out.println(result);
        System.out.println(simple(nums));
    }
}
