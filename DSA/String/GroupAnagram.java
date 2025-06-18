package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
     HashMap<String,List<String>>map = new HashMap<>(); 

    //  for(String s : strs){
    //     char[] ch = s.toCharArray();
    //     Arrays.sort(ch);
    //     String sorted = new String(ch);

    //     if(!map.containsKey(sorted)){
    //         map.put(sorted, new ArrayList<>());
    //     }
    //     map.get(sorted).add(s);
    //  }

    for(String s : strs){
      int  count[] = new int[26];
     
      for(char c : s.toCharArray()){
        count[c-'a']++;
      }
      StringBuffer sb = new StringBuffer();
      for(int i : count){
        sb.append("#");
        sb.append(i);
        }
        String key = sb.toString();

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());

        }
        map.get(key).add(s);
    }
    System.out.println(map.values());
  }

}
