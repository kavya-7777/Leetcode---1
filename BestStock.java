//121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return  maxProfit;
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         for(int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 int profit = prices[j] - prices[i];
//                 if(profit > max) max = profit;
//             }
//         }
//         return max;
//     }
// }