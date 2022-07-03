package com.LiKou.simple.liuyuefen2022;

/**
 * 玩筹码
 *
 * 思路：position = [2,2,2,3,3]  代表位置2有3个，位置3有两个
 * 其实奇数位置移动到奇数位置不需要代价，同理偶数位也是如此，那么将所有奇数位移动到位置1，偶数位移动到位置2.然后将较少的那个移动到多的那个
 * 相当于看奇数少，还是偶数少
 */
public class title1217 {

    public int minCostToMoveChips(int[] position) {
        int jishu = 0, oushu = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                oushu++;
            } else {
                jishu++;
            }
        }
        return Math.min(oushu, jishu);
    }

}
