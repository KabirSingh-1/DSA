package BitManupulation;

import java.util.Scanner;

public class ReverseBits {
    public static int approach1(int n){
       int result = 0;
       int helper = 1;
       for(int i = 0; i<32; i++){
        if((helper&n)!=0){
            result+=1<<31-i;
        }
        helper<<=1;
       }
       return result;
    }
    public static int approach2(int n){
       int result = 0;
       for(int i = 0; i<32; i++){
        result<<=1;
        result|=(n&1);
        n>>=1;
       }
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        System.out.println("approach one: "+approach1(n));
        System.out.println("approach two: "+approach2(n));
        sc.close();
    }
}
