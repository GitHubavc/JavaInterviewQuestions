package LeetCodeQuestions;

public class BestTimeToBuySellStocksTotalMaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyAndSellStockForMaxProfit(prices));

    }
    public static int buyAndSellStockForMaxProfit(int[] prices) {
        int max_profit = 0;
        for(int i=0;i<prices.length-1;i++) {
            if (prices[i] < prices[i+1]) {
                max_profit += prices[i+1]-prices[i];

            }
        }
        return max_profit;
    }
}
