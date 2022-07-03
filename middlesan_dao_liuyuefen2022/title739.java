package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 每日温度
 * <p>
 * 思路1：遍历数组，把当天i温度记为temp，然后遍历之后的数组，找到温度更高的日子j，然后j-i即为所求  时间复杂度：O(n^2) 空间复杂度：O(n)
 * <p>
 * 思路2：从后往前遍历数组   时间复杂度：O(n)  空间复杂度：O(n)
 * 若T[i] < T[i+1]，那么res[i]=1；
 * 若T[i] > T[i+1]
 * res[i+1]=0，那么res[i]=0;
 * res[i+1]!=0，那就比较T[i]和T[i+1+res[i+1]]（即将第i天的温度与比第i+1天大的那天的温度进行比较）
 */
public class title739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] rst = new int[temperatures.length];
        for (int i = 0; i < rst.length; i++) {
            int temp = temperatures[i];
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temp) {
                    rst[i] = j - i;
                    break;
                }
            }
        }
        return rst;
    }

    public int[] dailyTemperatures2(int[] temperatures) {
        int[] rst = new int[temperatures.length];
        for (int i = rst.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < temperatures.length; j = j + rst[j]) {
                if (temperatures[j] > temperatures[i]) {
                    rst[i] = j-i;//当天比后一天小
                    break;
                } else if (rst[j] == 0) {
                    rst[i] = 0;//当天比后一天大   然而后一天是最大的了  直接赋值0  如果后一天不是最大的  需要继续比较比后一天大的那天温度
                    break;
                }
            }
        }
        return rst;
    }

}
