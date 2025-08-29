package BitManupulation;

import java.util.Scanner;

public class SumofTwoIntegers {
    public static int sumofTwoInteger(int a , int b){
        int carry = a&b;
        int sum = a^b;
        int actualcarry = carry<<1;
        while(carry!=0){
           carry = actualcarry&sum;
           sum = actualcarry^sum;
           actualcarry= carry<<1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumofTwoInteger(a, b));

        sc.close();

    }
}
