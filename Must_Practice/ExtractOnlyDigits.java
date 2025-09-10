package Must_Practice;

import java.util.Scanner;

public class ExtractOnlyDigits {
    public static String method1(String str){
        return str.replaceAll("[^0-9]", "");
    }
    public static String manual(String str){
       StringBuilder gtr = new StringBuilder();
       for(char c : str.toCharArray()){
        if(Character.isDigit(c)){
            gtr.append(c);
        }
       }
       return gtr.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("original string : "+str);
        System.out.println("method 1 : "+method1(str));
        System.out.println("manual : "+manual(str));
        sc.close();
    }
}
