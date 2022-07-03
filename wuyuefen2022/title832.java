package com.LiKou.simple.wuyuefen2022;

/**
 *  翻转图像
 *
 * 思路1：一行一行的翻转，然后最后0变1   1变0
 *
 * 思路2：若相等，则最后结果为反转后结果，如 1,1 交换-> 1,1 反转-> 0,0
 * 若不等，则最后结果为自己本身，如 1,0 交换-> 0,1 反转-> 1,0
 */
public class title832 {

    public static int[][] flipAndInvertImage(int[][] image) {
        int x = image.length;
        int y = image[0].length;
        for (int i = 0; i < x; i++) {//进行水平翻转
            for (int j = 0; j < y / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][y - j - 1];
                image[i][y - j - 1] = temp;
            }
        }
        for (int i = 0; i < x; i++) {//进行0变1  1变0
            for (int j = 0; j < y; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
