package com.LiKou.simple.sansiyuefen2022;

/**
 * 有效的完全平方数
 */
public class title367 {
    public static void main(String[] args) {
        boolean bool = isPerfectSquare(14);
        System.out.println(bool);
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);  //得到开根值
        int a=(int)sqrt;  //将开根号值转为int
        if (a * a == num) {  //如果int的平方等于原来的数，那么就是平方数
            return true;
        } else {
            return false;
        }

    }
}
