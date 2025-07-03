
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string
package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String LCP(String[] str){
        if(str == null || str.length ==0){
            return "";
        }

        StringBuilder gtr = new StringBuilder();
        Arrays.sort(str);
        String firsString = str[0];
        String LastString = str[str.length-1];
        int n = firsString.length();
        int m = LastString.length();
        int minlength = Math.min(n, m);
        int i = 0;
        while(i<minlength && firsString.charAt(i) == LastString.charAt(i)){
              gtr.append(firsString.charAt(i));
              i++;
        }
        if(i ==0){
            return "";
        }

        return gtr.toString();
    }
      public static void main(String[] args) {
         String[] str = {"flower","flow","flight"};
         String result = LCP(str);
         System.out.println(result);
      }
    
}