package BitManupulation;

public class singleNum {
    public static int single(int nums[]){
        int num = 0;
        for(int n : nums){
            num^=n;
        }
        return num;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,1,3,2};
        System.out.println(single(nums));
    }
}
