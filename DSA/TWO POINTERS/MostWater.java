// two pointers keep in mind formula of area = min(height[left], height[right])*(right-left);
public class MostWater {

    public static int water(int height[]){
        int max_area = 0;
        int area = 0;
        int left = 0;
        int right = height.length-1;

        while (left<right) {
            area = Math.min(height[left],height[right])*(right-left);
            max_area = Math.max(area,max_area);

            if(height[left]>height[right]){
                right--;
            }
            else left++;
        }

        return max_area;
    }
   public static void main(String[] args) {
      int height[] = {1,8,6,2,5,4,8,3,7};
      System.out.println(water(height));
   } 
}
