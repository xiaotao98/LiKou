package com.LiKou.simple.sansiyuefen2022;

import java.util.Arrays;

/**
 *
 */
public class title121 {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    /**
     *动态规划
     */
    public int maxProfit1(int[] prices) {
        int dp[]=new int[prices.length];
        dp[0]=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return dp[dp.length-1];
    }

    public static int maxProfit(int[] prices) {

        int max = 0;//记录前i天的最大收获
        int min = prices[0];////记录前i-1天的最小值
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);//前i天的最大值就是  max（max，第i天-前i天的最小值）
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return max;

    }



}
