package com.LiKou.simple.sansiyuefen2022;


public class title88_2 {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        int[] merge = merge(nums1, m, nums2, n);
        for (int i : merge) {
            System.out.print(i + " ");
        }
    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];
        int a1 = 0;  //nums1 指针
        int b1 = 0;   //nums2 指针

        while (a1 < m && b1 < n) {
            if (nums1[a1] < nums2[b1]) {
                result[a1 + b1] = nums1[a1];
                a1++;
            } else {
                result[a1 + b1] = nums2[b1];
                b1++;
            }
        }

        while (a1 < m) {
            result[a1 + b1] = nums1[a1];
            a1++;
        }

        while (b1 < n) {
            result[a1 + b1] = nums2[b1];
            b1++;
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
        return nums1;
    }


}

