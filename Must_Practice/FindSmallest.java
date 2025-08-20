package Must_Practice;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Smallest(nums));
        sc.close();
    }
}
