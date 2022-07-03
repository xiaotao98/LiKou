package com.LiKou.simple.sansiyuefen2022;

/**
 * . Nim 游戏
 *
 * 找规律：只要是4的倍数，按照最优解，那我就必输，否则，我必赢
 */
public class title292 {
    public static void main(String[] args) {

    }

    public static boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        return true;
    }
}

