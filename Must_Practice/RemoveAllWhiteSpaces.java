package Must_Practice;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static String method1(String str){
        return str.replaceAll("//s+","");
    }
    public static String method2(String str){
       return str.replaceAll("[^a-zA-Z]","");
    }
    public static String method3(String str){
      return str.replace(" ", "");
    }
    public static String manual(String str){
        StringBuilder gtr = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!Character.isWhitespace(c)){
                gtr.append(c);
            }
        }
        return gtr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("method 1: "+method1(str));
        System.out.println("method 2: "+method2(str));
        System.out.println("method 3: "+method3(str));
        System.out.println("manual: "+manual(str));
        sc.close();
    }
}
