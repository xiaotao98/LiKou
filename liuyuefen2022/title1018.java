package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 可被 5 整除的二进制前缀
 * <p>
 * 思路:只需要看最后一位   是否为5的倍数 即可
 */
public class title1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = 2 * temp + nums[i];//计算上一位个位  加上 当前个位的和
            temp = temp % 10;//计算当前最后一位
            if (temp % 5 == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
