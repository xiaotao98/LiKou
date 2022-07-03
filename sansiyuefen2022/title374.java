package com.LiKou.simple.sansiyuefen2022;

import java.util.Scanner;

/**
 * 猜数字
 *
 * 思路：用二分法
 */
public class title374 {
    public static void main(String[] args) {

    }


        public int guessNumber(int n) {
            long left=1;
            long right=n;
            long mid=(n+1)/2;
            while(left<right){
                if(guess((int)mid)==0){
                    break;
                }
                if(guess((int)mid)==1){
                    left=mid+1;
                }
                if(guess((int)mid)==-1){
                    right=mid-1;
                }
                mid=(left+right)/2;
            }
            return (int)mid;
        }


    private int guess(int parseInt) {
        return 0;
    }


}
