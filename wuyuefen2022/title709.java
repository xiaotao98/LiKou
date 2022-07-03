package com.LiKou.simple.wuyuefen2022;

public class title709 {
    public static void main(String[] args) {
        String s = "LOVELY";
        String string = toLowerCase(s);
        System.out.println(string);

    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                sb.append((char) (s.charAt(i) + 32));  //大写字母的ascii码要小  所以要加32  再转为char
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
