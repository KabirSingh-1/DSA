package Must_Practice;
import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String original = sc.nextLine();

        StringBuilder gtr = new StringBuilder(original);
        gtr.reverse();

        System.out.println(gtr.toString());
        
    }

}
