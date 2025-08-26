import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals){
        if (intervals.length == 0) {   
            return new int[][] {};
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int[] currArr = intervals[0];
        list.add(currArr);
        for(int[] arr : intervals){
            int currArrEnd = currArr[1];
            int nextStart = arr[0];
            int nextEnd = arr[1];
            if(currArrEnd>=nextStart){
                currArr[1] = Math.max(currArrEnd,nextEnd);
            }
            else{
                currArr = arr;
                list.add(currArr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        
        int[][] result = merge(intervals);

        for(int[] arr: result){
            for(int num: arr){
                System.out.print("{"+num+"}");
            }
        }
    }
}
