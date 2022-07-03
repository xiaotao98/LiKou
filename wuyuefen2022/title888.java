package com.LiKou.simple.wuyuefen2022;


import java.util.Arrays;

/**
 * 公平的糖果交换
 * <p>
 * 思路1：计算mid=sum1+sum2  然后计算cha=sum1-mid的数值  将两个数组排序  找  aliceSizes[left] - bobSizes[right]=cha
 * <p>
 * 思路2:计算mid=sum1+sum2  然后计算cha=sum1-mid的数值  将两个数组排序,分别去两个数组中找
 */
public class title888 {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2, 5};
        int[] bobSizes = {2, 4};
        int[] arr = fairCandySwap(aliceSizes, bobSizes);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] rst = new int[2];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 = sum1 + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2 = sum2 + bobSizes[i];
        }
        int mid = (sum1 + sum2) / 2;// mid代表的是每个人最终拥有的数量
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int cha = sum1 - mid;
        int left = 0, right = 0;
        while (left < aliceSizes.length && right < bobSizes.length) {
            int temp = aliceSizes[left] - bobSizes[right];
            if (temp == cha) {
                rst[0] = aliceSizes[left];
                rst[1] = bobSizes[right];
                break;
            } else if (temp < cha) {
                left++;
            } else {
                right++;
            }
        }
        return rst;
    }

    /**
     * 思路2
     */
    public static int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes) {
        int[] rst = new int[2];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 = sum1 + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2 = sum2 + bobSizes[i];
        }
        int mid = (sum1 + sum2) / 2;// mid代表的是每个人最终拥有的数量
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        if (sum1 < sum2) {// 小的换大的
            for (int i = 0; i < aliceSizes.length; i++) {
                boolean flag = false;
                rst[0] = aliceSizes[i];
                int cha = mid - (sum1 - aliceSizes[i]);// 这个是还需要的量
                for (int j = bobSizes.length - 1; j >= 0; j--) {
                    if (bobSizes[j] == cha) {// 找到了
                        flag = true;
                        rst[1] = bobSizes[j];
                        break;
                    }
                    if (bobSizes[j] < cha) {// 不可能找到了
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        } else {// 大的换小的
            for (int i = 0; i < bobSizes.length; i++) {
                boolean flag = false;
                rst[1] = bobSizes[i];
                int cha = mid - (sum2 - bobSizes[i]);// 这个是还需要的量
                for (int j = aliceSizes.length - 1; j >= 0; j--) {
                    if (aliceSizes[j] == cha) {// 找到了
                        flag = true;
                        rst[0] = aliceSizes[j];
                        break;
                    }
                    if (aliceSizes[j] < cha) {// 不可能找到了
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        return rst;
    }
}
