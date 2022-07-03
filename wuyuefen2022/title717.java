package com.LiKou.simple.wuyuefen2022;

public class title717 {
    public static void main(String[] args) {
        int[] bits = {1, 1, 1, 0};
        boolean bool = isOneBitCharacter(bits);
        System.out.println(bool);

    }

    /**
     *思路：其实就只需要判断除去数组最后一位元素的那些数字   是否能刚好编码完   如果不能  则最后一位不可能为0
     */
    public static boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        for (int i = 0; i < bits.length - 1; i++) {
            if (bits[i] == 0) {
                count++;
            } else {
                if (bits[i + 1] == 0 || bits[i + 1] == 1) {
                    count = count + 2;
                    i++;// 这里i需要在多跳一位
                }
            }
        }
        if (count == bits.length - 1) {// count==bits.length-1说明前面的全部编码成功，那么剩下最后一个只能是0
            return true;
        }
        return false;
    }
}
