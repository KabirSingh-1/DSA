package Must_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        HashMap<Character,Integer> count = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char ch : str.toCharArray()){
            count.put(ch,count.getOrDefault(ch, 0)+1);
        }

        System.out.println(count);

    }
}
