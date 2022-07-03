package com.LiKou.simple.sansiyuefen2022;

/**
 * 构造矩形   给定面积   求相隔最近的长和宽
 *
 * 思路：对面积开根号  如果area对开根号数不能整除，那么就-1，直到能整除，那么这个数就是宽
 */
public class title492 {
    public static void main(String[] args) {
        int[] ints = constructRectangle(122122);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int sqrt = (int) Math.sqrt(area);
        while (area % sqrt != 0) {
            sqrt--;
        }
        arr[0] = area / sqrt;
        arr[1] = sqrt;
        return arr;

    }
}
