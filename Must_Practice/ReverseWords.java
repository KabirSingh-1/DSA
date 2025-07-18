package Must_Practice;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
       
        String[] words = sentance.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            
            StringBuilder str = new StringBuilder(word).reverse();
            result.append(str).append(" ");
        }
        System.out.println("original sentance: "+sentance);
        System.out.println("updated sentance: "+result.toString().trim());
    }
}
