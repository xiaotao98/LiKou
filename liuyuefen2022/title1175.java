package com.LiKou.simple.liuyuefen2022;

/**
 * 质数排列
 *
 * 思路：首先计算出1-n质数个数x，然后其他数个数为（n-x） 然后x的阶乘与（n-x）的阶乘的乘积就是最终结果
 * 注意：每一次相乘都让他对（ mod 10^9 + 7）取余，防止数太大
 */
public class title1175 {

    public static int numPrimeArrangements(int n) {
        int zhishu = 0;
        int other = 0;
        for (int i = 2; i <= n; i++) {
            boolean bool = judeg(i);//判断是否为质数
            if (bool) {
                zhishu++;
            }
        }
        other = n - zhishu;
        double rst = 1;
        for (int i = 1; i <= zhishu; i++) {
            rst = (rst * i)% (Math.pow(10, 9) + 7);
        }
        for (int i = 1; i <= other; i++) {
            rst = (rst * i)% (Math.pow(10, 9) + 7);
        }
        return (int) (rst);
    }

    public static boolean judeg(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
