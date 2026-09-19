class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int profit = 0;
        int buy = prices[0];
        for(int sell=1;sell<prices.length;sell++) {
           if(prices[sell] > buy) {
               if((prices[sell] - buy) > profit) profit = prices[sell] - buy;
           }
           else if(prices[sell] < buy) {
               buy = prices[sell];
           }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.err.println(maxProfit(prices));
    }
}