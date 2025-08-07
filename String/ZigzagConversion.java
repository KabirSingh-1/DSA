package String;

public class ZigzagConversion {
    public static String convert(String s , int numRows) {
        StringBuilder[] row = new StringBuilder[numRows];
        for(int i = 0; i<numRows; i++){
            row[i] = new StringBuilder();
        }
        int index = 0;
        boolean godown = false;
        for(char c : s.toCharArray()){
            row[index].append(c);
            if(index == 0 || index == numRows-1){
                godown = !godown;
            }
            index+=godown?1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder str : row){
           result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));

    }
}
