package Must_Practice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("before "+"value of a: "+a+", value of b: "+b);

        // method 1

        // int temp = a;
        // a = b;
        // b = temp;

        // method 2
        a = a^b;
        b = a^b;
        a = a^b;


        System.out.println("After "+"value of a: "+a+", value of b: "+b);

    }
}
