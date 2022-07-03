package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 爱吃香蕉的珂珂
 *
 * 思路：用二分法  最后返回left
 */
public class title875 {public static void main(String[] args) {
    int[] piles = {30, 11, 23, 4, 20};
    int i = minEatingSpeed(piles, 6);
    System.out.println(i);

}

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 100000001;//先设定k的最小值和最大值
        while (left <= right) {
            int mid = (left + right) / 2;//每次要吃的数量，然后判断
            if (check(mid, piles) <= h) {//吃的太多了  注意：当check(mid, piles)==h时，mid还有可能取更小的  所以不能在=h时  直接返回
                right = mid - 1;
            } else {//吃得太少了
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 计算每小时吃mid个  需要的总时间
     */
    public static int check(int mid, int[] piles) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            int shang = piles[i] / mid;
            int yushu = piles[i] % mid;
            time = time + shang + (yushu == 0 ? 0 : 1);
        }
        return time;
    }
}
