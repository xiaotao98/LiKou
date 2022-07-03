package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 增减字符串匹配
 */
public class title942 {
    public static void main(String[] args) {
        String s = "III";
        int[] a = diStringMatch(s);
        for(int aa:a) {
            System.out.println(aa);
        }
    }

    public static int[] diStringMatch(String s) {
        int len = s.length();
        int[] arr=new int[len+1];
        int left=0,right=len;

        for (int i = 0; i < len; i++) {//碰I存最小 碰D存最大
            if (s.charAt(i)=='I') {
                arr[i]=left;
                left++;
            }else {
                arr[i]=right;
                right--;
            }
        }
        arr[len]=left;//最后存剩下的那个数字
        return arr;
    }
}
