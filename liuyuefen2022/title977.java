package com.LiKou.simple.liuyuefen2022;

/**
 * 有序数组的平方
 * <p>
 * 思路：先数组平方，然后排序
 */
public class title977 {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //冒泡
        //maopao(nums);

        //快排
        kuaipai(nums, 0, nums.length - 1);
        return nums;
    }

    public static void kuaipai(int[] nums, int left, int right) {
        if (left > right) {//必写  递归终止条件
            return;
        }
        int left0 = left;
        int right0 = right;
        int jizhun = nums[left0];
        while (left != right) {
            while (nums[right] >= jizhun && left < right) {
                right--;
            }
            while (nums[left] <= jizhun && left < right) {
                left++;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        int temp = nums[left];
        nums[left] = nums[left0];
        nums[left0] = temp;
        kuaipai(nums, left0, left - 1);
        kuaipai(nums, left + 1, right0);
    }

    public static void maopao(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
