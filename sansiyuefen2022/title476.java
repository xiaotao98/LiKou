package com.LiKou.simple.sansiyuefen2022;

public class title476 {
    public static void main(String[] args) {
        int result = findComplement(5);
        System.out.println(result);
    }
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] schars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < schars.length; i++) {
            if (schars[i]=='0'){
                schars[i]='1';
                sb.append(schars[i]);
            }else {
                schars[i]='0';
                sb.append(schars[i]);
            }

        }
        String news = sb.toString();//得到的是反码的二进制
        return Integer.valueOf(news, 2) ;//将反码的十进制再+1
    }
}
