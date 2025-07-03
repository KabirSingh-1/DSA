public class BandSstock2 {
    public static void main(String[] args) {
        int prices[] = {1,2,3,4,5};

if (prices == null || prices.length <= 1) {
    System.out.println("Total Profit: 0");
    return;
}
        // logic -1
        // int profit = 0;
        // int totalProfit = 0;
        // int buy = prices[0];
        

        // for(int i = 1; i<prices.length; i++){
        //     profit = Math.max(profit, prices[i]-buy);

        //     totalProfit+=profit;
        //     profit = 0;
        //     buy = Math.min(prices[i], buy);
        //     buy = prices[i];
        // }
        //System.out.println(totalProfit);

        //logic 2
    
        int max_profit = 0;


        for(int i = 1; i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                max_profit+=(prices[i]-prices[i-1]);
            }
        }

     System.out.println(max_profit);
        
    }
}
