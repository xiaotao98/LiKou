package com.LiKou.simple.liuyuefen2022;

/**
 * 有效的山脉数组
 *
 * 思路：设计两个标记位zen，jiang，初始值均为false，然后遍历数组判断即可
 * 必为先增后降   增时  zen改为true  然后jiang必为false   降时 jiang改为true  增必为true  否则返回false
 */
public class title941 {

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean zen = false;
        boolean jiang = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                zen = true;  //标记上坡
                if (jiang) {//下坡必为false
                    return false;
                }
            } else if (arr[i] == arr[i - 1]) {
                return false;
            } else {
                jiang = true;//标记下坡
                if (!zen) {//上坡必为true
                    return false;
                }
            }
        }
        return zen && jiang;//只有两个都为true时才是
    }
}
