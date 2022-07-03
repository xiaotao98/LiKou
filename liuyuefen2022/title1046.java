package com.LiKou.simple.liuyuefen2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 最后一块石头的重量
 * <p>
 *思路：将数组的数移动到list中进行操作。
 * 首先对list进行排序，然后计算最后两个数字的差值(大-小)
 * 差值为0，list直接移除最后两位
 * 差值不为0，list直接移除最后两位，然后list加上他们的差值
 * 重复上述操作，直到list的长度小于等于1
 */
public class title1046 {

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int i : stones) {
            list.add(i);
        }
        while (list.size() > 1) {
            Collections.sort(list);
            int max1 = list.get(list.size() - 1);
            int max2 = list.get(list.size() - 2);
            int cha = max1 - max2;
            list.remove(list.size() - 1);//移除最后一位
            list.remove(list.size() - 1);//移除倒数第二位
            if (cha != 0) {
                list.add(cha);
            }
        }
        if (list.size() == 0) {
            return 0;
        }
        return list.get(0);
    }

}
