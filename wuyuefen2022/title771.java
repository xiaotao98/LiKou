package com.LiKou.simple.wuyuefen2022;

/**
 * 宝石与石头
 *
 *  思路：取出石头中的每个字符  看他是否在宝石中
 */
public class title771 {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            boolean bo = jewels.contains(stones.charAt(i) + "");
            if (bo) {
                count++;
            }
        }
        return count;
    }
}
