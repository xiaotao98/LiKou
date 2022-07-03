package com.LiKou.simple.sansiyuefen2022;

/**
 * 排硬币
 */
public class title441 {
    public static void main(String[] args) {

    }
    public int arrangeCoins(int n) {
        for(int i=1;i<=n;i++){//最多n层
            n=n-i;//每层过后   减去对应的个数
            if(n<i+1){//判断是否还能填满下一层
                return i;
            }
        }
        return 0;
    }
}
