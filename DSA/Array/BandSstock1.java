
public class BandSstock1 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int buy= prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length;i++){
          buy = Math.min(prices[i], buy);
          profit = Math.max(prices[i]-buy, profit);
            
        }
        System.out.println(profit);
    }
}
