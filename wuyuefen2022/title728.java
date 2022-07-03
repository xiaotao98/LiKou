package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数 128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 *
 */
public class title728 {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(47, 85);
        System.out.println(list);

    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean flag = true;
            int num = i;
            while (num > 0) {
                int x = num % 10;//取这个数最后一位
                if (x == 0) {//如果为0 直接退出循环
                    flag = false;
                    break;
                }
                if (i % x != 0) {//余数不为0  直接退出循环
                    flag = false;
                    break;
                }
                num = num / 10;//每次判断了最后一位，让他减少10倍
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }
}
