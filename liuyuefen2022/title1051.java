package com.LiKou.simple.liuyuefen2022;

import java.util.Arrays;

/**
 * 高度检查器
 * <p>
 * 思路：先排序，然后判断
 */
public class title1051 {

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int i = heightChecker(heights);
        System.out.println(i);
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] arr = Arrays.copyOfRange(heights, 0, heights.length);
        kuaipai(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void kuaipai(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int left0 = left;
        int right0 = right;
        int jizhun = arr[left0];
        while (left != right) {
            while (arr[right] >= jizhun && left < right) {
                right--;
            }
            while (arr[left] <= jizhun && left < right) {
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
        kuaipai(arr, left0, left - 1);
        kuaipai(arr, left + 1, right0);
    }

}
