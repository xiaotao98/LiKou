package com.LiKou.simple.sansiyuefen2022;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 *
 * 新知识：Integer.bitCount(int i)   输出i的二进制1的个数   比如i=3   输出2
 */
public class title401 {
    public static void main(String[] args) {

    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    list.add(h+":"+(m<10?"0"+m:m));
                }
            }
        }
        return list;
    }
}
