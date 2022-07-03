package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 跳跃游戏
 *
 * 思路：只要数组中元素都不为0  必定可以到达最后一位。从倒数第二位往前遍历数组，如果遇到0，判断这个0能否跳过去，即可
 */
public class title55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                boolean flag = false;
                int j = i - 1;
                for (int l = j; l >= 0; l--) {
                    if (nums[l] > i - l) {
                        i = l;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {//说明这个0跳不过去
                    return false;
                }
            }
        }
        return true;
    }
}
