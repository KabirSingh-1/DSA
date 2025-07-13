package Must_Practice;

import java.util.Scanner;

public class CountVandC {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       str = str.toLowerCase();
       int vowels = 0;
       int consonants = 0;
       for(char ch : str.toCharArray()){
        if(ch>='a' && ch<='z'){
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vowels++;
            } 
            else consonants++;
        }
       } 

       System.out.println("Vowels: "+vowels+", Consonants: "+consonants);
    }
}
