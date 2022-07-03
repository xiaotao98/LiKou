package com.LiKou.simple.liuyuefen2022;

/**
 * 分割平衡字符串
 * <p>
 * 思路：用r记录R的数量，用l记录L的数量，遍历字符串，当r=l时，count++，同时 r和 l 归零
 */
public class title1221 {

    public int balancedStringSplit(String s) {
        int count=0;
        int r=0,l=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                l++;
            }else {
                r++;
            }
            if (r==l){
                count++;
                r=0;
                l=0;
            }
        }
        return count;
    }

}
