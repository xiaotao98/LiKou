package com.LiKou.simple.wuyuefen2022;

/**
 * 单调数列
 * <p>
 * 思路：对数组中的升序和降序计数   最后判断即可
 */
public class title896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int shen = 1;
        int jiang = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                jiang++;
            } else if (nums[i - 1] < nums[i]) {
                shen++;
            } else {
                jiang++;
                shen++;
            }
        }
        if (shen == nums.length || jiang == nums.length) {
            return true;
        }
        return false;
    }
}
