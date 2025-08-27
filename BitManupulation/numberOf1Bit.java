package BitManupulation;

import java.util.Scanner;

public class numberOf1Bit {
    public static int approach1(int n){
        int count = 0;
        String str = Integer.toBinaryString(n);
        char ch[] = str.toCharArray();
        for(char c : ch){
            if(c == '1'){
                count++;
            }
        }
        return count;
    }
    public static int approach2(int n){
        int count = 0;
        int helper = 1;
        for(int i = 1; i<=32; i++){
            if((helper & n)!=0){
                count+=1;
            }
            helper= helper<<1;
        }
        return count;
    }

    public static int approach3(int n){
        int count = 0;
   
         while(n!=0){
            n &= n-1;
            count++;
         }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.println("approach one : "+approach1(n));
        System.out.println("approach two : "+approach2(n));
        System.out.println("approach three : "+approach3(n));
        sc.close();
    }
}
