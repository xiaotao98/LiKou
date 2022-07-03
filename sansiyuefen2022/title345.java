package com.LiKou.simple.sansiyuefen2022;

/**
 * 反转字符串中的元音字母
 * <p>
 * 思路：
 */
public class title345 {
    public static void main(String[] args) {
        String s = ".,";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String YuanYin = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        char temp;
        int left = 0, right = s.length() - 1;  //设置左右两个指针
        while (left < right) {
            String sright = String.valueOf(chars[right]);//右指针指向的数值
            String sleft = String.valueOf(chars[left]);//左指针指向的数值

            while (!YuanYin.contains(sleft) && left < right) {//左指针值若不为可交换的值，并且<right  +1
                left++;
                sleft = String.valueOf(chars[left]);
            }
            while (!YuanYin.contains(sright) && left < right) {
                right--;
                sright = String.valueOf(chars[right]);
            }
            //到达这里，说明左右指针均指向元音字母    交换数值
            if (left < right) {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }

            //交换完毕  指针继续移动
            left++;
            right--;
        }
        for (char aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }
}
