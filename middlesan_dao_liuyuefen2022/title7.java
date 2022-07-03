package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 整数反转
 * <p>
 * 思路1：将整数转为字符串，字符串翻转再转为正数，有异常则返回0
 * <p>
 * 思路2：ret 保存旧的翻转中间值, temp 保存新的翻转过程中间值
 * 依次提取 x 的末位加入 temp, 如果发生溢出则通过temp/10!=ret  temp乘10  又除以10  不和原来相等  就说明溢出了
 */
public class title7 {

    //将x的末位放到ret的正位
    public int reverse2(int x) {
        int ret = 0;
        while (x != 0) {
            int temp = ret * 10 + x % 10;
            if (temp / 10 != ret) {//temp乘10  又除以10  不和原来相等  就说明溢出了
                return 0;
            }
            ret = temp;
            x=x/10;
        }
        return ret;
    }

    public static int reverse1(int x) {
        boolean flag = true;//标记是否为正数
        if (x < 0) {
            flag = false;
        }
        int abs_x = Math.abs(x);
        String s = String.valueOf(abs_x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        String revresr = sb.reverse().toString();
        try {
            int i = Integer.parseInt(revresr);
            if (!flag) {
                return -1 * i;
            }
            return i;
        } catch (Exception e) {
            return 0;
        }
    }
}
