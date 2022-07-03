package com.LiKou.simple.sansiyuefen2022;

/**
 * 下一个更大元素 I
 *
 * 思路：先找到数组2中的坐标x，如果为数组最后一个值，直接-1  否则，遍历数组2 从坐标x+1开始剩下的部分 即可
 */
public class title496 {
    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] ints = nextGreaterElement(nums1, nums2);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int aim = -1;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    aim = j;//找到nums2中的坐标
                    break;
                }
            }
            if (aim == nums2.length - 1) {
                arr[i] = -1;//nums2的下表到最后一个  直接返回-1
            } else {//找到的坐标不是最后一个，则遍历第二个数组部分数值找
                for (int k = aim + 1; k < nums2.length; k++) {
                    if (nums2[k] > nums1[i]) {
                        arr[i] = nums2[k];//找到了，直接赋值给他
                        break;
                    }
                    if (k == nums2.length - 1) {
                        arr[i] = -1;//nums2的下表到最后一个  直接返回-1
                    }
                }
            }
        }
        return arr;
    }
}
