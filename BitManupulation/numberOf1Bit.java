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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.println("approach one : "+approach1(n));
        sc.close();
    }
}
