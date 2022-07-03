package com.LiKou.simple.sansiyuefen2022;

/**
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i
 * 计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 *
 * 思路：遍历 0-n 中的每一个数字，将数字转为二进制字符串，然后转为字符数组，遍历字符数组，得到其中1的个数
 * 然后将1的个数存入到 数组中
 */
public class title338 {
    public static void main(String[] args) {
        int[] ints = countBits(5);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);  //十进制转为二进制
            char[] chars = s.toCharArray();
            int num = 0;  //1初始个数为0
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1') {
                    num++;
                }
            }
            arr[i] = num;
        }
        return arr;
    }
}
