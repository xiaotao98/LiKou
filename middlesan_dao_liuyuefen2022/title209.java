package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 长度最小的子数组
 *
 *利用滑动窗口的思想   窗口大小是不固定的   尽量小
 */
public class title209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int len = minSubArrayLen(target, nums);
        System.out.println(len);
    }

    /**
     *跟自己的思路差不多  但是代码更加简洁  容易理解
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;//子串和
        int result = nums.length + 1;// 定义结果为一个不可能的数字
        int left = 0;//子串所在的窗口左边指针
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            if (sum>=target){
                result=Math.min(result,i-left+1);//窗口大小
                while (sum-nums[left]>=target){//尽可能从左边缩小窗口
                    sum=sum-nums[left];
                    left++;
                    result=Math.min(result,i-left+1);
                }
            }
        }
        if (result == nums.length + 1) {// 说明没有符合条件的子串
            return 0;
        }
        return result;
    }
    /**
     *自己写的滑动窗口
     */
    public static int minSubArrayLen2(int target, int[] nums) {
        int len = 0;//子串长度
        int sum = 0;//子串和
        int result = nums.length + 1;// 定义结果为一个不可能的数字
        boolean flag = false;//用来标记当前子串的和是否大于等于target
        int left = 0;//子串所在的窗口左边指针
        for (int i = 0; i < nums.length; i++) {
            if (flag) {// 说明目前的sum>=target,则窗口往右边移动一位，然后尽可能移动左边窗口
                sum = sum + nums[i];
                len++;
                while (sum - nums[left] >= target) {// 判断是否能移动左边的窗口
                    sum = sum - nums[left];
                    left++;
                    len--;
                    if (len < result) {
                        result = len;
                    }
                }
            } else {
                sum = sum + nums[i];
                len++;
                if (sum >= target) {// 子串和大于等于target
                    result = len;
                    while (sum - nums[left] >= target) {// 判断当前是否能移动左边缩小窗口。
                        sum = sum - nums[left];
                        left++;
                        len--;
                        if (len < result) {
                            result = len;
                        }
                    }
                    flag = true;
                }
            }

        }
        if (result == nums.length + 1) {// 说明没有符合条件的子串
            return 0;
        }
        return result;
    }
}
