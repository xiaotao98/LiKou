package com.LiKou.simple.liuyuefen2022;

/**
 * 仅仅反转字母
 * <p>
 * 思路：把字符串先单独取出来，把符号单独取出来，然后定义一个数组，是符号的为0  然后分别将他们拼接上去
 */
public class title917 {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String s1 = reverseOnlyLetters(s);
        System.out.println(s1);

    }

    /**
     * 双指针
     */
    public static String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            while (!Character.isLetter(chars[left]) && left < right) {
                left++;
            }
            while (!Character.isLetter(chars[right]) && left < right) {
                right--;
            }
            Character temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static String reverseOnlyLetters1(String s) {
        String new_s = "";
        String fuhao_s = "";
        String rst = "";
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                arr[i] = 1;
                new_s = s.charAt(i) + new_s;
            } else {
                fuhao_s = fuhao_s + s.charAt(i);
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {//说明此处是符号
                rst = rst + fuhao_s.charAt(y);
                y++;
            } else {//此处是字母
                rst = rst + new_s.charAt(x);
                x++;
            }
        }
        return rst;
    }
}
