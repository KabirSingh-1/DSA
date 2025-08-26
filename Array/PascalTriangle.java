import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
       int numROw = 5;
       List<List<Integer>> result =  pascalTriangle(numROw);
       for(List<Integer> list : result){
        System.out.println(list);
       }
       // last row of pascal triangle
       System.out.println(result.get(numROw-1));
    }
    public static List<List<Integer>> pascalTriangle(int numROw){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i<numROw; i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j<=i; j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}