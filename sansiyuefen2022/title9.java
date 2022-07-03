package com.LiKou.simple.sansiyuefen2022;

public class title9 {
    public static void main(String[] args) {
        int x=2442;
        String s = x + "";
        char[] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        boolean flag=true;
        while (left<=right){
            if (chars[left]!=chars[right]){
                flag=false;
                break;
            }else {
                left++;
                right--;
            }
        }
        System.out.println(flag);
    }
}
