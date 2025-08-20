package Must_Practice;

import java.util.HashMap;

public class CountFrequency {
    public static HashMap<String,Integer> Frequency(String[] fruits){
        HashMap<String,Integer> map = new HashMap<>();
        for(String item : fruits){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana","Orange", "Orange", "Apple", "Orange", "Grape"};
        // call function 
        HashMap<String ,Integer> map = Frequency(fruits);

        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
           System.out.print(entry.getKey()+" - "+entry.getValue()+", ");
        }

    }
}
