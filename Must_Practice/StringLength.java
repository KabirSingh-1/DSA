package Must_Practice;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        int length = 0;
        try{
            while(true){
                str.charAt(length);
                length++;
            }

        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
       System.out.println(length);
       
    }
}
