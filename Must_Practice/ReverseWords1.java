package Must_Practice;


public class ReverseWords1 {
    public static String reverseWords(String sentance){
        String wrods[] = sentance.split("\\s");
        StringBuilder str = new StringBuilder();
        for(int i = wrods.length-1; i>=0; i--){
            str.append(wrods[i]+" ");
            // if(i>0)str.append(" ");
        }
        return str.toString();
    }
    public static String reverseWords2(String sentance){
      
        String word[] = sentance.split(" +");
        StringBuilder str = new StringBuilder();
        for(int i = word.length-1; i>=0; i--){
          str.append(word[i]+" ");
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseWords(sentence));
        System.out.println("Reversed: " + reverseWords2(sentence));
    }
}
