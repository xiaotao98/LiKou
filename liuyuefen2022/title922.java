package com.LiKou.simple.liuyuefen2022;

/**
 * 按奇偶排序数组 II
 * <p>
 * 思路：设置一个偶数指针和一个奇数指针，当他们所指定的数字不符合要求时，暂停，交换两个指针所指的数字，否则继续后移，直至某个指针遍历完数组
 *
 * 思路2：新建数组，然后遍历数组，将数组中偶数存到偶数位，奇数存到奇数位
 */
public class title922 {
    public static int[] sortArrayByParityII(int[] nums) {
        boolean flag = false;
        int oushu = 0;
        int jishu = 1;
        while (oushu < nums.length && jishu < nums.length) {
            while (nums[oushu] % 2 == 0) {
                oushu = oushu + 2;
                if (oushu >= nums.length) {
                    flag = true;
                    break;
                }
            }
            while (nums[jishu] % 2 != 0) {
                jishu = jishu + 2;
                if (jishu >= nums.length) {
                    flag = true;
                    break;
                }
            }
            if (flag) {//说明已经交换完毕
                break;
            }
            int temp = nums[oushu];
            nums[oushu] = nums[jishu];
            nums[jishu] = temp;
            oushu = oushu + 2;
            jishu = jishu + 2;
        }
        return nums;
    }
}
