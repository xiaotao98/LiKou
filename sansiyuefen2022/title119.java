package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角 2
 *
 * 思路：跟上一个题目类似的思路，但是要注意   这里输入2，其实是要输出第三行，所以要多一行
 */
public class title119 {
    public static void main(String[] args) {
    }

    public static List<Integer> shengchang(int numRows) {
        List<List<Integer>> listResult = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        list2.add(1);

        if (numRows == 0) {//1行
            listResult.add(list1);
            return listResult.get(numRows);
        }
        listResult.add(list1);
        if (numRows == 1) {//2行
            listResult.add(list2);
            return listResult.get(numRows);
        }
        listResult.add(list2);
        List<Integer> oldlist = list2;


        for (int i = 3; i <=numRows+1; i++) {//大于等于3行
            List<Integer> newlist = new ArrayList<>();
            newlist.add(1);//第一位为1
            for (int j = 1; j < i; j++) {
                if (j < i - 1) {
                    newlist.add(oldlist.get(j - 1) + oldlist.get(j));
                } else {
                    newlist.add(1);//最后一位为1
                }
            }
            listResult.add(newlist);
            oldlist = newlist;

        }
        return listResult.get(numRows);
    }


}
