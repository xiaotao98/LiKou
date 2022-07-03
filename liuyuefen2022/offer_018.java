package com.LiKou.simple.liuyuefen2022;

/**
 * 剑指 Offer II 018. 有效的回文
 * <p>
 * 思路：双指针  先把所有的大写转为小写，然后判断左右指针所指的字符是否相同
 */
public class offer_018 {

    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (!(Character.isLetter(s1.charAt(left)) || Character.isDigit(s1.charAt(left))) && left < right) {
                left++;
            }
            while (!(Character.isLetter(s1.charAt(right)) || Character.isDigit(s1.charAt(right))) && left < right) {
                right--;
            }
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
