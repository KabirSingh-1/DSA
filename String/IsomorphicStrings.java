package String;

import java.util.HashMap;

public class IsomorphicStrings {
    public  static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if((map.containsKey(ss) && map.get(ss)!=tt) || (!map.containsKey(ss) && map.values().contains(tt))) return false;
            map.put(ss,tt);
        
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
    }
}
