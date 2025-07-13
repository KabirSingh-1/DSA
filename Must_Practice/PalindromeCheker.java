package Must_Practice;

import java.util.Scanner;

public class PalindromeCheker {
    public static boolean Palindrome(String str){
        boolean isPalindrome = true;
        int n = str.length();
        if(n == 0) return isPalindrome;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        System.out.println(Palindrome(str)?"this is palindrome":"this is not palindrome");


    }
}
