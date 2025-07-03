package String;

public class validPalindrome {
   public static void main(String[] args) {
         
           String s = "A man, a plan, a canal: Panama";

           if(s.isEmpty()){
            System.out.println("true");
           }
           String str = s.toLowerCase();
           str = str.replaceAll("[^a-zA-Z0-9]","");
           System.out.println(str);
           

           StringBuilder gtr = new StringBuilder(str);

           gtr.reverse();

           System.out.println(gtr.toString());

           String rstr = gtr.toString();

           if(str.equals(rstr)){
            System.out.println("ture");
           }else System.out.println("false");
        

    }
}
