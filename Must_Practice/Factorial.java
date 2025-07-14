package Must_Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n ==0 || n == 1){
            System.out.println("factoril: "+1);
            return;
        }
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println("factoril: "+fact);
    }
}
