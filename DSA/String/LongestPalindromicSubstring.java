package String;

public class LongestPalindromicSubstring {

    public static String LPS(String s){
        String result = "";
        for( int i = 1; i<s.length(); i++){


            // odd length

            int low = i;
            int high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length()>result.length()){
                result = palindrome;
            }

            // even length
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }
        }
            return result;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(LPS(s));
    }
}
