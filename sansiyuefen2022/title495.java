package com.LiKou.simple.sansiyuefen2022;

/**
 * 提莫中毒时间
 */
public class title495 {
    public static void main(String[] args) {

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int times=duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1]>=duration){
                times=times+duration;
            }else{
                times=times+timeSeries[i]-timeSeries[i-1];
            }
        }
        return times;
    }
}
