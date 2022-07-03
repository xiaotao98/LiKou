package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class title497 {

    /*
    int[][] rects;

    public Solution(int[][] rects) {
        this.rects = rects;
    }

    public int[] pick() {
        Random r = new Random();
        int index = -1, n = 0;//index抽取矩形的下标，n是所有点的数量和
        for (int i = 0; i < rects.length; i++) {
            int k = (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);//计算本个矩形的所有点
            n = n + k;//计算全部的所有点
            if (r.nextInt(n) < k) {//如果随机数小于这个矩形的所有点
                index = i;
            }
        }
        int[] rec = rects[index];//抽到矩形后，再从这个矩形中随机抽取x、y的值
        int x1 = rec[0], x2 = rec[2], y1 = rec[1], y2 = rec[3];
        return new int[]{x1 + r.nextInt(x2 - x1 + 1), y1 + r.nextInt(y2 - y1 + 1)};
    }
*/
}
