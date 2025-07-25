package Must_Practice;

import java.util.Arrays;

public class StringAnagram {
    public static boolean anagram(String s1,String s2){
        s1= s1.replaceAll("\\s","").toLowerCase();
        s2= s2.replaceAll("\\s","").toLowerCase();

        if(s1.length()!=s2.length()) return false;
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       return  Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        System.out.println(anagram(s1, s2));
    }
}