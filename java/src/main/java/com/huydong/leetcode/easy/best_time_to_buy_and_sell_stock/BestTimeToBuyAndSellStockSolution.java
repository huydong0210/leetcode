package com.huydong.leetcode.easy.best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStockSolution {
    public int maxProfit(int[] prices) {
        int minimumBuying = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minimumBuying);
            minimumBuying = Math.min(minimumBuying, prices[i]);
        }
        return maxProfit;
    }
}
