package BitManupulation;

import java.util.Scanner;

public class BitwiseAND {
    public static int rangeBitwiseAnd(int left , int right){
        int count = 0;
        while(left!=right){
            left>>=1;
            right>>=1;
            count++;
        }
        return left<<count;

    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int left = sc.nextInt();
       int right = sc.nextInt();
       int result = rangeBitwiseAnd(left, right);
       System.out.println(result);
       sc.close();
   } 
}
