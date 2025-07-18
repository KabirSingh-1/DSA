package Must_Practice;

import java.util.Scanner;

public class primeNumber extends PrimLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];
        
        for(int i = 0; i<nums.length; i++){
             nums[i] = sc.nextInt();
             if(prim(nums[i])){
                 System.out.println("prime");
             }
             else{
                System.out.println("non prime");
             }
        }
    }  
}
