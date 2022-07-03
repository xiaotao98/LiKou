package com.LiKou.simple.liuyuefen2022;

/**
 * 奇数值单元格的数目
 *
 * 思路：遍历数组indices，当遍历到第0列，让结果数组那一行+1，遍历到第1列，让结果数组那一列+1
 */
public class title1252 {

    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] arr=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j==0){//行加
                    for (int k = 0; k < arr[0].length; k++) {
                        arr[indices[i][j]][k]++;
                    }
                }else {//列加
                    for (int k = 0; k < arr.length; k++) {
                        arr[k][indices[i][j]]++;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }

}
