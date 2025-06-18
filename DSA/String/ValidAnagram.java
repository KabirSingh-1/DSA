
// Given two strings s and t, return true if t is an anagram(equal to each other)of s, and false otherwise.
package String;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram{
    public static boolean anagram(String s,String t){
         if(s.length()!=t.length()) return false;

         char[] sArray = s.toCharArray();
         char[] tArray = t.toCharArray();
         Arrays.sort(sArray);
         Arrays.sort(tArray);
         return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String t = sc.nextLine();
       System.out.println(anagram(s,t));
    }
}