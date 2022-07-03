package com.LiKou.simple.sansiyuefen2022;

/**
 * 把两个数组一一比较
 * （注意定义一个变量记录数组的值是否比较完了，比较完了直接存未比较完的数组)
 * 存到一个新数组
 * 最后把新数组中的数保存到第一个数组中即可
 */
public class title88 {
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


        public static int[] merge ( int[] nums1, int m, int[] nums2, int n){
            if (n == 0) {
                return nums1;
            }
            int[] result = new int[m + n];
            int a1 = 0;  //nums1 指针
            int b1 = 0;   //nums2 指针
            int c = 0;   //c是记数组nums1的数字有没有比完  比完了  nums2后面的数直接加到nums1后面去
            int d = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[a1] < nums2[b1]) {

                    if (c >= m) {
                        result[i] = nums2[b1];
                        b1++;
                    } else {
                        result[i] = nums1[a1];
                        c++;
                    }
                    if (a1 < m - 1) {
                        a1++;
                    }

                } else {
                    if (d >= n) {
                        result[i] = nums1[a1];
                        a1++;
                    } else {
                        result[i] = nums2[b1];
                        d++;
                    }

                    if (b1 < n - 1) {
                        b1++;
                    }

                }
            }
            for (int i = 0; i < result.length; i++) {
                nums1[i] = result[i];
            }
            return nums1;
        }


    }

