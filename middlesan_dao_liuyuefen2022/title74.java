package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class title74 {
    public static void main(String[] args) {

    }

    /**
     * 搜索二维矩阵
     *
     * 思路：先确定在那个一维数组  然后去一维数组中用二分法找  即可
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int hang = matrix.length;
        int lie = matrix[0].length;
        boolean flag = false;
        for (int i = 0; i < hang; i++) {
            int left = matrix[i][0];//每个一维数组的第一个元素
            int right = matrix[i][lie - 1];//每个一维数组的末尾元素
            if (target >= left && target <= right) {// 找到符合的那个一维数组
                // 然后在这个一维数组中用二分法找
                flag = true;// 标记来区间找过了
                int left0=0;
                int right0=lie-1;
                while (left0 <= right0) {
                    int mid = (left0 + right0) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    }
                    if (matrix[i][mid] > target) {
                        right0 = mid - 1;
                    } else {
                        left0 = mid + 1;
                    }
                }
                if (flag) {// 说明区间没找到 后面就不需要继续找了
                    return false;
                }
            }
        }
        return false;
    }
}
