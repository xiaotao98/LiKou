package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数
 *
 * 思路：将整数转为字符串，然后获得字符串的每一位char类型，将char转为string  再转为int
 * 将每一位数字的平方加起来  看得到的结果是否为1  或者出现过，如果都没有，就继续循环
 */
public class title202 {
    public static void main(String[] args) {
        int n = 7;
        boolean bool = isHappy(n);
        System.out.println(bool);
    }

    public static boolean isHappy(int n) {
        boolean bool = false;
        String s = String.valueOf(n);
        List<Integer> num = new ArrayList<>();
        num.add(n);
        while (n != 1) {//递归   如果n出现重复值或者n=1  那么就退出循环
            n = pingfanghe(s);
            if (num.contains(n)) {//关键  看n是否出现过
                return bool;
            }
            num.add(n);
            s = String.valueOf(n);
        }
        bool = true;
        return bool;
    }

    private static int pingfanghe(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result + (int) Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), 2);//char 转为string 再转为int
        }
        return result;
    }

}
