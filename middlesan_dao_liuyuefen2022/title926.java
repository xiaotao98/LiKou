package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 将字符串翻转到单调递增
 *
 * 思路：当遍历到0  可以保留  那么之前的1设为0    不保留  反转次数+1
 */
public class title926 {

    public static int minFlipsMonoIncr(String s) {
        int count_1 = 0, rst = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count_1++;
            } else {//当遍历到0  可以保留  那么之前的1设为0    不保留  反转次数+1
                rst = Math.min(rst + 1, count_1);
            }
        }
        return rst;
    }

}
