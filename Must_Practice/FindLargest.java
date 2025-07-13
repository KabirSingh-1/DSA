package Must_Practice;

public class FindLargest {
    public static int Largest(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,9,6,5,7,1};
        System.out.println(Largest(nums));
    }
}
