package com.LiKou.simple.liuyuefen2022;

/**
 * 复写零
 *
 * 思路1：遍历数组，遇到0，然后就将后面的元素后移一位
 *
 * 思路2：新创一个数组，然后将非0元素赋值给他，遇到0元素就跳过
 */
public class title1089 {

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                for (int j = arr.length-1; j >i; j--) {
                    arr[j]=arr[j-1];
                }
                i++;
            }
        }
    }

    public void duplicateZeros2(int[] arr) {
        int[] temp=new int[arr.length];
        for (int i = 0,j=0; i < arr.length&&j<arr.length; i++,j++) {
            if (arr[i]==0){
                j++;
            }else {
                temp[j]=arr[i];
            }
        }
        for(int i  = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

}
