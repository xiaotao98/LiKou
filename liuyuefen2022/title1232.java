package com.LiKou.simple.liuyuefen2022;

/**
 * 缀点成线
 * <p>
 * 思路1：利用斜率公式，转成乘法
 * <p>
 * 思路2：直接用除法的斜率公式，不过需要判断一下分母是否为0
 */
public class title1232 {

    public boolean checkStraightLine1(int[][] coordinates) {
        int y = coordinates[1][1] - coordinates[0][1];//y2-y1
        int x = coordinates[1][0] - coordinates[0][0];//x2-x1
        for (int i = 2; i < coordinates.length; i++) {
            int temp_y = coordinates[i][1] - coordinates[0][1];//y3-y1
            int temp_x = coordinates[i][0] - coordinates[0][0];//x3-x1
            if (y * temp_x != x * temp_y) {
                return false;
            }
        }
        return true;
    }

    public boolean checkStraightLine2(int[][] coordinates) {
        double k = 0;
        if (coordinates[1][0] - coordinates[0][0] == 0) {
            k = Integer.MAX_VALUE;//说明分母为0，平行于y轴
        } else {
            k = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0] - 0.0);
        }
        for (int i = 2; i < coordinates.length; i++) {
            if (k == Integer.MAX_VALUE) {//分母为0
                int fenmu = coordinates[i][0] - coordinates[0][0];
                if (fenmu != 0) {
                    return false;
                }
            } else {//分母不为0，直接用斜率公式
                double temp = (coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0] - 0.0);
                if (temp != k) {
                    return false;
                }
            }
        }
        return true;
    }

}
