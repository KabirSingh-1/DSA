package Must_Practice;

public class FindSmallest {
    public static int Smallest(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[] = {44,50,78,29,87,45,33};
        System.out.println(Smallest(nums));
    }
}
