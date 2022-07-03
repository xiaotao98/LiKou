package com.LiKou.simple.wuyuefen2022;

public class title605 {
    public static void main(String[] args) {
        int[] flowerbed = {0};
        int n = 1;
        boolean bool = canPlaceFlowers(flowerbed, n);
        System.out.println(bool);
    }

    /**
     * 巧解：在数组的首尾增加一个0元素，然后看有多少个连续的三个0即可
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;//记种花数
        int[] newflowerbed = new int[flowerbed.length + 2];//定义的新数组，将原先数组首尾加0然后赋给他
        newflowerbed[0] = 0;
        newflowerbed[newflowerbed.length - 1] = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            newflowerbed[i + 1] = flowerbed[i];
        }
        for (int i = 1; i < newflowerbed.length - 1; i++) {//判断新数组种连续三个0的次数
            if (newflowerbed[i] == 0 && newflowerbed[i - 1] == 0 && newflowerbed[i + 1] == 0) {
                count++;
                newflowerbed[i] = 1;//找到了可以种花的 让其值变为1
            }
        }
        if (count >= n) {
            return true;
        }
        return false;
    }

    /**
     * 自己思路：就是找到能种的花数目，然后和n比较  即可   注意  这种方法数组长度为1，2的需要单独判断
     */
    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int count = 0;
        if (flowerbed.length == 1) {//数组长度为1的情况
            if (flowerbed[0] == 0) {
                count++;
            }
            if (count >= n) {
                return true;
            }
            return false;
        }
        if (flowerbed.length == 2) {//数组长度为2的情况
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                count++;
            }
            if (count >= n) {
                return true;
            }
            return false;
        }

        //数组长度大于等于3的情况
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            count++;
            flowerbed[0] = 1;//头可以种花
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {//判别数组1-length-1  头和尾单独判断
            if (flowerbed[i] == 1) continue; //种了花  直接终止本次循环
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                count++;
                flowerbed[i] = 1;//种了花要将数值改变
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            count++;
            flowerbed[flowerbed.length - 1] = 1;//尾巴可以种花
        }
        if (count >= n) {
            return true;
        }
        return false;
    }
}
