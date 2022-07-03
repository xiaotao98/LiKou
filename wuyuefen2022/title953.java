package com.LiKou.simple.wuyuefen2022;

/**
 * 验证外星语词典
 *
 * 思路：遍历数组，两两比较。
 */
public class title953 {
    public static void main(String[] args) {
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = {"hello", "leetcode"};
        boolean bool = isAlienSorted(words, order);
        System.out.println(bool);

    }

    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {// 两两比较
            int s1 = words[i].length();
            int s2 = words[i + 1].length();
            int min = s1;
            if (s2 < min) {//记录较小其中较小的长度
                min = s2;
            }
            for (int j = 0; j < min; j++) {//比较公共的长度
                if (order.indexOf(words[i].charAt(j)) - order.indexOf(words[i + 1].charAt(j)) > 0) {
                    return false;//发现不符合要求的直接return
                }
                if (order.indexOf(words[i].charAt(j)) - order.indexOf(words[i + 1].charAt(j)) < 0) {
                    break;// 发现符合要求直接终止本次比较循环
                }
                //走到这一步，说明公共长度比完了，需要判断谁长谁短
                if (j == min - 1 && s1 > s2) {// 第一个比第二个长，直接return
                    return false;
                }
            }
        }
        return true;
    }
}
