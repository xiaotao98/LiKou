package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 对角线遍历
 * <p>
 * 思路：模拟实现，定义一个标志flag=true代表升。
 * 正常升：(x,y)变为(x-1,y+1)  如果(x-1,y+1)点不合理  升转为降，降的话初始点选右边那个点，右边点不合理就选下那个点。
 * 正常降：(x,y)变为(x+1,y-1)  如果(x-1,y+1)点不合理  降转为升，升的话初始点选下边那个点，下边点不合理就选右那个点。
 */
public class title498 {

    public static int[] findDiagonalOrder(int[][] mat) {
        int hang = mat.length;
        int lie = mat[0].length;
        int[] rst = new int[hang * lie];
        int x = 0, y = 0;
        boolean flag = true;//true代表升，false代表降
        for (int i = 0; i < rst.length; i++) {
            int start = mat[x][y];
            if (x >= 0 && x < hang && y >= 0 && y < lie) {
                rst[i] = start;
            }
            if (i == rst.length - 1) {
                break;
            }
            if (flag) {//升,然后判断(x-1,y+1)是否合理，不合理转为降,且更改降起始点
                if (x - 1 >= 0 && x - 1 < hang && y + 1 >= 0 && y + 1 < lie) {
                    x = x - 1;
                    y = y + 1;
                } else {//更改降起始点，先选右  右不行选下
                    flag = false;
                    if (x >= 0 && x < hang && y + 1 >= 0 && y + 1 < lie) {//选右
                        y = y + 1;
                    } else {//选下
                        x = x + 1;
                    }
                }
            } else {//降,然后判断(x+1,y-1)是否合理，不合理转为升,且更改升起始点
                if (x + 1 >= 0 && x + 1 < hang && y - 1 >= 0 && y - 1 < lie) {
                    x = x + 1;
                    y = y - 1;
                } else {//更改升起始点，先选下  下不行选右
                    flag = true;
                    if (x + 1 >= 0 && x + 1 < hang && y >= 0 && y < lie) {//选下
                        x = x + 1;
                    } else {//选右
                        y = y + 1;
                    }
                }
            }
        }
        return rst;
    }

}
