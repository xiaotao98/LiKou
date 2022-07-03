package com.LiKou.simple.sansiyuefen2022;

/**
 * 七进制数
 */
public class title504 {
    public static void main(String[] args) {
        String s = convertToBase7(-1);
        System.out.println(s);
    }

    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if (num < 7 && num >-7) {  //在这之间  直接返回
            return String.valueOf(num);
        }

        boolean flag = true;//如果为false  说明这个数是负数
        if(num<0){
            flag=false;
        }
        num = Math.abs(num);
        while (num >= 7 ) {
            int yushu = num % 7;
            num = num / 7;
            sb.append(yushu);
        }
        if (flag) {
            sb.append(num);
        } else {//为负数
            sb.append(num).append("-");
        }
        return sb.reverse().toString();
    }
}
