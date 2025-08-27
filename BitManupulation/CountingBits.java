package BitManupulation;

import java.util.Scanner;

public class CountingBits {
    public static int[] count(int n){
       int nums[] = new int[n+1];
       for(int i = 0; i<=n; i++){
        nums[i] = approach1(i);
       }
       return nums;
    }
    public static int approach1(int n){
       int count = 0;
       String str = Integer.toBinaryString(n);
       char ch[] = str.toCharArray();
       for(char c : ch){
        if(c=='1'){
            count+=1;
        }
       }
       return count;
    }
    public static int approach2(int n){
       int count = 0;
       while(n!=0){
        n&=n-1;
        count++;
       }
       return count;
    }
    public static int approach3(int n){
       int count = 0;
       int helper = 1;
       for(int i = 1; i<=32; i++){
        if((helper&n)!=0){
            count++;
        }
        helper= helper<<1;
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int nums[] = count(n);
        for(int num : nums){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
