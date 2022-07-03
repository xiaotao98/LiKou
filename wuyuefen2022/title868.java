package com.LiKou.simple.wuyuefen2022;

/**
 * 二进制间距
 * <p>
 * 思路：先将整数转为二进制字符串，然后遍历字符串，用两个指针记录1的位置，然后取相邻1的最大值
 */
public class title868 {
    public static void main(String[] args) {
        int n = 22;
        int i = binaryGap(n);
        System.out.println(i);
    }

    public static int binaryGap(int n) {
        int max = 0;
        int left = -1, right = -1;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && left == -1) {// 说明是第一个1
                left = i;
            } else if (binary.charAt(i) == '1' && right == -1 && left != -1) {// 说明是第2个1
                right = i;

            } else if (binary.charAt(i) == '1') {// 说明不是第一个1,也不是第二个1
                left = right;
                right = i;
            }
            int len = right - left;
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
}
