package String;

public class LargestOddNumberinString {
    static String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1; i>=0; i--){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "232455567870";
        System.out.println(largestOddNumber(str));
    }
}
