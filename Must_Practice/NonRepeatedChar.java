package Must_Practice;

import java.util.HashMap;

public class NonRepeatedChar {
        public static char FirstNonRepeatedCharcter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : str.toCharArray()){
            if(map.get(c) == 1) return c;
        }
       return '\0';
    }
    public static void NonRepeatedCharcters(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder gtr = new StringBuilder();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : str.toCharArray()){
            if(map.get(c) == 1) gtr.append(c);
        }
        str =  gtr.toString();
        for(char i : str.toCharArray()){
          System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(FirstNonRepeatedCharcter(str));
        NonRepeatedCharcters(str);
    }
}
