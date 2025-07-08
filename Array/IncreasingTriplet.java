public class IncreasingTriplet {
    public static boolean Triplet(int nums[]){
        int n = nums.length;
        if(n<2)return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=first){
                first = num;
            }
            else if(num<=second){
                second =  num;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        System.out.println(Triplet(nums));
    }
}
