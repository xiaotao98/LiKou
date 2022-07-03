package com.LiKou.simple.wuyuefen2022;

public class title598 {
    public static void main(String[] args) {

    }

    //每次操作都是左上角区域从（0, 0）到（a, b）的矩形，必定重叠，所以找最小的a乘最小的b就行
    public static int maxCount(int m, int n, int[][] ops) {

        if ( ops.length==0){
            return m*n;
        }
        int a=ops[0][0],b=ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            int[] op = ops[i];
            if (ops[i][0]<a){//比的是第一个元素
                a=ops[i][0];
            }
            if (ops[i][1]<b){//比的是第二个元素
                b=ops[i][1];
            }

        }
        return a*b;
    }
}
