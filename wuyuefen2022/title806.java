package com.LiKou.simple.wuyuefen2022;

/**
 * 思路：sum一个一个+ 判断是否>100 如果大于 行数+1 sum归0加上本次的单位 指代遍历完所有字符
 *
 */
public class title806 {

    public static int[] numberOfLines(int[] widths, String s) {
        int[] rst = new int[2];
        int sum = 0;//记录最后一行占用的单位
        int hang = 1;//记录行数
        for (int i = 0; i < s.length(); i++) {
            if (sum + widths[s.charAt(i) - 'a'] <= 100) {
                sum = sum + widths[s.charAt(i) - 'a'];
            } else {
                hang++;
                sum = 0 + widths[s.charAt(i) - 'a'];
            }
        }
        rst[0] = hang;
        rst[1] = sum;
        return rst;
    }
}
