package HashTables;

import java.util.HashMap;
import java.util.Scanner;

public class EncodeandDecodeTinyURL {
    private static final String Base_Url = "http://tinyurl.com/";
    private static int id = 0;
    private static HashMap<Integer ,String> map = new HashMap<>();
    public  static String Encode(String LongUrl){
       map.put(id,LongUrl);
       return Base_Url+id++;
    }
    public static String Decode(String ShortUrl){
        int id = Integer.parseInt(ShortUrl.replace(Base_Url,""));
        return map.get(id);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String LongUrl = sc.nextLine();
        String ShortUrl = Encode(LongUrl);
        System.out.println(ShortUrl);
        String LongUrlOld = Decode(ShortUrl);
        System.out.println(LongUrlOld);
        sc.close();
    }
}
