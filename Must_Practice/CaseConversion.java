package Must_Practice;

public class CaseConversion {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        StringBuilder gtr = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                gtr.append(str.toLowerCase());
            }
            else if(Character.isLowerCase(c)){
                gtr.append(str.toUpperCase());
            }else{

            gtr.append(c);
            }
        }
    }
}
