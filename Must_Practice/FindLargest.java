package Must_Practice;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println(Largest(nums));
        sc.close();
    }
}
