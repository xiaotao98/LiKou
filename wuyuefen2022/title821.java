package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符的最短距离
 * <p>
 * 思路1:把字符串s中字符c出现的下标记录到一个数组arr中   新建一个结果数组rst 然后遍历字符串s
 * 只要当前字符不等于c中字符   则需要判断距离   拿当前下标放到数组arr中进行一个二分查找   则会找到与当前下标距离最近的一个点或两个点
 *
 * 思路二：就是把每个字符减去最近出现过的c的下标  得到一系列差值    然后倒着遍历数组   进行同样的操作  取对应位置最小的那个数
 */
public class title821 {

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] ints = shortestToChar(s, c);
        for (int i : ints) {
            System.out.print(i + " ");
        }

    }

    public static int[] shortestToChar(String s, char c) {
        int[] rst = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {//把字符c出现的下标记录到数组中
            arr[i] = list.get(i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                int index = erfen(i, arr);//二分法找
                if (index > 0) {//找到的下标大于0需要比较两个点
                    rst[i] = Math.min(Math.abs(i - arr[index]), Math.abs(i - arr[index - 1]));
                } else {//找到的下标等于0只需要比较一个点
                    rst[i] = Math.abs(i - arr[index]);
                }
            }
        }
        return rst;
    }

    public static int erfen(int i, int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while ((left <= right)) {
            int mid = (left + right) / 2;
            if (arr[mid] == i) {
                return arr[mid];
            }
            if (arr[mid] < i) {
                left = mid + 1;
            }
            if (arr[mid] > i) {
                right = mid - 1;
            }
        }
        if (left >= arr.length) {//这是因为如果传进来的数i大于数组中所有的数  最后返回的left会越界
            return left - 1;
        }
        return left;
    }
}
