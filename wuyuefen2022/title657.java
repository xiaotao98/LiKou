package com.LiKou.simple.wuyuefen2022;

import java.util.HashMap;
import java.util.Map;

public class title657 {
    public static void main(String[] args) {
        String moves = "UD";
        boolean bool = judgeCircle(moves);
        System.out.println(bool);
    }

    public static boolean judgeCircle(String moves) {
        //将上下左右以及对应的次数存入到map中
        int rl=0,ud=0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i)=='R'){
                rl++;
            }
            if (moves.charAt(i)=='L'){
                rl--;
            }
            if (moves.charAt(i)=='U'){
                ud++;
            }
            if (moves.charAt(i)=='D'){
                ud--;
            }
        }

        return rl==0&&ud==0;

    }
}
