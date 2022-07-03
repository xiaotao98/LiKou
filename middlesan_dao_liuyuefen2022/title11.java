package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 盛最多水的容器
 * <p>注意  这里暴力法会超时
 * 思路：利用双指针的思想。对O(n)的算法写一下自己的理解，一开始两个指针一个指向开头一个指向结尾，此时容器的底是最大的，
 * 接下来随着指针向内移动，会造成容器的底变小，在这种情况下想要让容器盛水变多，就只有在容器的高上下功夫。
 * 那我们该如何决策哪个指针移动呢？我们能够发现不管是左指针向右移动一位，还是右指针向左移动一位，容器的底都是一样的，都比原来减少了 1。
 * 这种情况下我们想要让指针移动后的容器面积增大，就要使移动后的容器的高尽量大，所以我们选择指针所指的高较小的那个指针进行移动，一直移动到更高的边
 */
public class title11 {
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(height);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int chang = 0, gao = 0;
        int max = 0;
        while (left < right) {
            chang = right - left;
            gao = Math.min(height[left], height[right]);
            max = Math.max(max, chang * gao);
            int l = height[left];
            int r = height[right];
            if (height[left] < height[right]) {//移动较小的边，直到高大于原来的值
                while (height[left] <= l && left < right) {
                    left++;
                }
            } else {
                while (height[right] <= r && left < right) {
                    right--;
                }
            }
        }
        return max;
    }

    public static int maxArea2(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
