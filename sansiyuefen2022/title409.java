package com.LiKou.simple.sansiyuefen2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class title409 {
    public static void main(String[] args) {
        int result = longestPalindrome("aaabbb");
        System.out.println(result);
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                Integer old = map.get(s.charAt(i));
                map.put(s.charAt(i), old + 1);
            }
        }

        Set<Character> keySet = map.keySet();
        int sum = 0;

        for (Character c : keySet) {
            if (map.get(c) % 2 == 0) {//这里是把所有出现偶数次的长度加起来
                sum = sum + map.get(c);
            }
            if (map.get(c)%2!=0&&map.get(c)>1){//这里是把所有>1的奇数次的长度 减1 加起来
                sum=sum+map.get(c)-1;
            }
        }

        for (Character c : keySet) {//这里是看有没有出现奇数次的
            if (map.get(c) % 2 != 0) {
                sum = sum + 1;
                break;
            }
        }
        return sum ;
    }
}
