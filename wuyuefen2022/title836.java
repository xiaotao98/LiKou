package com.LiKou.simple.wuyuefen2022;

/**
 * 矩形重叠
 * <p>
 * 思路：左边矩形最右边<=右边矩形最左边    下边矩形最上边<=上边矩形最下边
 * 注意  每个矩形都有可能是左右上下
 */
public class title836 {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {//A B

        //左边矩形最右边<=右边矩形最左边
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }

        //下边矩形最上边<=上边矩形最下边
        if (rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        }
        return true;
    }
}
