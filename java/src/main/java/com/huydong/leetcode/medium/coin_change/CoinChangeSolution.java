package com.huydong.leetcode.medium.coin_change;

public class CoinChangeSolution {
    public int coinChange(int[] coins, int amount) {
        int[] index = new int[amount + 1];
        for (int i = 0; i < index.length; i++) {
            index[i] = amount + 1;
        }
        index[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int tmp = i - coins[j];
                if (tmp < 0) {
                    break;
                }
                if (index[tmp] == amount + 1) {
                    continue;
                }
                if (index[tmp] + 1 < index[i]) {
                    index[i] = index[tmp] + 1;
                }

            }
        }
        return index[amount] == amount + 1 ? -1 : index[amount];
    }


}
