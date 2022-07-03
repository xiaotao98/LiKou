package com.LiKou.simple.wuyuefen2022;

/**
 * 山脉数组的峰顶索引
 * <p>
 * 思路1：遍历数组，找到那个比左右都大的下标
 * <p>
 * 思路2：用二分法去找  注意如果用二分法找数组所有，需要注解左边边界特殊情况。
 */
public class title852 {

    /**
     * 二分法   在除去头和尾的数组中找，可以不需要考虑边界问题
     */
    public static int peakIndexInMountainArray(int[] arr) {//二分
        int left = 1, right = arr.length - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) {//说明最大值在mid右边
                left = mid + 1;
            }
            if (arr[mid] > arr[mid + 1]) {//说明最大值在mid左边
                right = mid - 1;
            }
        }
        return 0;
    }

    /**
     * 二分法   在所有的数组中找
     */
    public static int peakIndexInMountainArray1(int[] arr) {//二分
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == 0) {//这是左边界特殊的情况，如果mid为0了，则说明1必定为最大值
                return 1;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] < arr[mid + 1]) {//说明最大值在mid右边
                left = mid + 1;
            }
            if (arr[mid] > arr[mid + 1]) {//说明最大值在mid左边
                right = mid - 1;
            }
        }
        return 0;
    }
}
