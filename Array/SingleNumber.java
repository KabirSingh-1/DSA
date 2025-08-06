public class SingleNumber {
    static int single(int nums[]){
        int number = 0;
        for(int num : nums){
            number^=num;
        }
        return number;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(single(nums));
    }
}
