package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为 K 的子数组  连续子数组
 * <p>
 * 思路：首先新建一个数组sun[]  sum[i]记录前i个数的和   然后遍历数组sum[]
 * 计算一个差值temp = sum[i] - k  看map中是否有temp，如果有，就将rst加上map中的值，然后将sum[i]每个数值存入到map中
 */
public class title560 {

    public static int subarraySum(int[] nums, int k) {
        int sum[] = new int[nums.length + 1];//sum[i]记录前i个数的和
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int rst = 0;
        Map<Integer, Integer> map = new HashMap<>();//记录sum[i]的数值，以及出现的次数
        for (int i = 0; i < sum.length; i++) {
            int temp = sum[i] - k;
            if (map.containsKey(temp)) {//说明sum[i]到temp之间的数和为k
                rst += map.get(temp);
            }
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }
        return rst;
    }

}
