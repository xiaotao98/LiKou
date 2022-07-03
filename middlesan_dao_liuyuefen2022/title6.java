package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * Z 字形变换
 * <p>
 * 思路：找规律。要么上升，要么下降，用StringBuilder数组来做。第0行放第0个sb，第一行放第1个sb，以此类推。
 * 在合理的i范围内，其次是要找到下降的起点，下降起点位 row = i % (numRows + (numRows-2)) 然后将sb数组每个sb都赛一个字符。
 * 完毕后开始上升，上升只需要将sb数组除去尾和头都塞一个字符.重复上述步骤
 */
public class title6 {

    public static String convert(String s, int numRows) {
        StringBuilder sb[] = new StringBuilder[numRows];
        String rst = "";
        if (numRows == 1 || s.length() <= numRows) {//一行的情况，或者一列的情况
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            int row = i % (numRows + (numRows - 2));//计算当前起点
            if (row == 0) {//判断是否为下降的起点
                for (int k = 0; k < sb.length; k++) {
                    sb[k].append(s.charAt(i));
                    i++;
                    if (i >= s.length()) {
                        break;
                    }
                }
            } else {//向上
                for (int k = sb.length - 2; k > 0; k--) {
                    sb[k].append(s.charAt(i));
                    i++;
                    if (i >= s.length()) {
                        break;
                    }
                }
            }
            i--;
        }
        for (int i = 0; i < sb.length; i++) {
            rst = rst + sb[i];
        }
        return rst;
    }

}
