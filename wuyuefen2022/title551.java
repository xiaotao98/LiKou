package com.LiKou.simple.wuyuefen2022;

public class title551 {
    public static void main(String[] args) {
        String s = "PPALLL";
        boolean b = checkRecord(s);
        System.out.println(b);
    }

    public static boolean checkRecord(String s) {
        int a = 0, l = 0;//a缺勤，l迟到
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {//缺勤
                a++;
                if (a >= 2) {//缺勤两天
                    return false;
                }
                l = 0;//迟到归0
            }
            if (s.charAt(i) == 'L') {//迟到
                l++;
                if (l >= 3) {//连续迟到三天
                    return false;
                }
            }
            if (s.charAt(i) == 'P') {//到场
                l = 0;//迟到归0
            }
        }
        return true;
    }
}
