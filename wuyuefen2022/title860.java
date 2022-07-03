package com.LiKou.simple.wuyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 柠檬水找零
 * <p>
 * 思路：只要是5美元就直接接受，然后用一个map记录当前手中的钞票，收到下一张就去修改map中的数量  找零（优先用10元找零）
 */
public class title860 {
    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 10, 20};
        boolean bool = lemonadeChange(bills);
        System.out.println(bool);
    }

    public static boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        // 初始化，手中没钱
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.put(5, map.get(5) + 1);
            } else if (bills[i] == 10) {// 找零
                if (map.get(5) > 0) {
                    map.put(5, map.get(5) - 1);
                    map.put(10, map.get(10) + 1);
                } else {
                    return false;
                }
            } else {// 找零（优先用10元找零）
                if (map.get(5) > 0 && map.get(10) > 0) {
                    map.put(5, map.get(5) - 1);
                    map.put(10, map.get(10) - 1);
                    map.put(20, map.get(20) + 1);
                } else if (map.get(5) > 2) {
                    map.put(5, map.get(5) - 3);
                    map.put(20, map.get(20) + 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
