package com.LiKou.simple.liuyuefen2022;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 卡牌分组
 *
 * 思路：首先用map记录所有数字出现的次数,然后求出现的次数中的所有数的最大公约数   如果最大公约数>=2  return true
 */
public class title914 {
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            } else {
                map.put(deck[i], 1);
            }
        }
        Collection<Integer> values = map.values();
        int x = 0;//首先得让最大公约数为0
        for (Integer value : values) {
                x = gcd(x, value);
                if (x == 1) {
                    return false;
                }
        }
        return x >= 2;
    }

    /**
     *辗转相除法算最大公约数
     */
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
