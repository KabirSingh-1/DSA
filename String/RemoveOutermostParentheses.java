package String;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        String str = "";
        int n = s.length();
        int opening = 0, closing= 0;
        int start = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(') opening++;
            else closing++;
            if(opening == closing){
                str+=(s.substring(start+1, i));
                start= i+1;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())")); // "()()()"
    }
}
