package com.LiKou.simple.wuyuefen2022;

import java.util.Map;

/**
 * 图片平滑器   算每一个格子的平均灰度
 * <p>
 * 思路：先创建一个和原来相同大小的新数组，然后计算里面的每一个数值（关键）
 */
public class title661 {
    public static void main(String[] args) {

    }

    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;//矩阵的行和列
        int[][] ret = new int[m][n];//定义一个新的二维数组

        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[i].length; j++) {
                int count = 0, num = 0;
                for (int a = -1; a <= 1; a++) {//计算3*3个格子的数值
                    for (int b = -1; b <= 1; b++) {
                        if (!(i + a < 0 || i + a >= m || j + b < 0 || j + b >= n)) {//所有符合条件
                            count = count +img[i+a][j+b];
                            num++;
                        }
                    }
                }
                ret[i][j] = (int) Math.floor(count / num);//向下取整
            }
        }
        return ret;
    }
}
