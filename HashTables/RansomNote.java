package HashTables;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static boolean method1(String RansomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : RansomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static boolean method2(String RansomNote, String magazine) {
        int magazineFq[] = new int[26];
        for (char c : magazine.toCharArray()) {
            magazineFq[c - 'a']++;
        }
        for (char c : RansomNote.toCharArray()) {
            if (magazineFq[c - 'a'] == 0) {
                return false;
            }
            magazineFq[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RansomNote = sc.nextLine();
        String magazine = sc.nextLine();
        sc.close();
    }
}
