package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
     HashMap<String,List<String>>map = new HashMap<>(); 

     for(String s : strs){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);

        if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<>());
        }
        map.get(sorted).add(s);
     }
    System.out.println(map.values());
  }

}
