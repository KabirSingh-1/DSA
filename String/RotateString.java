package String;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()) return false;
       String s1 = s+s;
    //    int n = goal.length();
    //    for(int i = 0; i<goal.length(); i++){
    //     String sub = s1.substring(i,n);
    //     n++;
    //     if(goal.equals(sub)) return true;
    //    }
    //    return false;
    return s1.contains(goal);
    }
    public static void main(String[] args) {
        String str = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(str,goal));
    }
}
