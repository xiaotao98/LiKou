package com.LiKou.simple.wuyuefen2022;

import java.util.ArrayList;
import java.util.List;

public class title566 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int[][] ints = matrixReshape(mat, 2, 4);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int hang = mat.length;//行
        int lie = mat[0].length;//列
        if (hang * lie != r * c) {//不合理  直接返回原来的矩阵
            return mat;
        }

        //将原有矩阵每个值存入到list中
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
            }
        }

        //将每一个值存入到新矩阵中
        int[][] newArr = new int[r][c];
        int x = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = list.get(x);
                x++;
            }
        }
        return newArr;
    }
}
