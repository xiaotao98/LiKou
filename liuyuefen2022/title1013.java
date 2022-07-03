package com.LiKou.simple.liuyuefen2022;

/**
 * 将数组分成和相等的三个部分
 *
 * 思路：注意题目条件，3部分均是相连着的，所以难度大大降低。
 * 首先判断是否为3的倍数。用count表示段数，遍历数组，找到和为三分之一，count++
 * 当count=2的时候，如果数组后面还有值，那么后面的数值必定也为三分之一，返回true。否则，返回false。
 */
public class title1013 {

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int aid = sum / 3;
        sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == aid) {
                count++;
                sum = 0;
                if (count == 2&&i!=arr.length-1) {//注意 需要判断后面是否还有元素
                    return true;
                }
            }
        }
        return false;
    }

}
