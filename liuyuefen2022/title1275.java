package com.LiKou.simple.liuyuefen2022;

/**
 * 找出井字棋的获胜者
 *
 * 思路： 1、只关注最后一个玩家即可
 *       如果最后一个玩家的同一行或同一列或对角线上有三个或三个以上相同元素则最后一个玩家获胜
 *       至于最后一个玩家到底是A还是B可以通过判断索引是奇数还是偶数还确定到底是哪个玩家
 *       2、最后一个玩家没有获胜的情况
 *       此时检查一下方格是否已经被填满了，如果填满了说明是平局
 *       如果没有填满说明游戏还未结束
 */
public class title1275 {

    public String tictactoe(int[][] moves) {
        int row = 0;
        int line = 0;
        int zheng = 0;
        int fu = 0;
        int key = (moves.length - 1) % 2;//代表最后一位是A还是B
        int[] last = moves[moves.length - 1];
        int cha = last[0] - last[1];//主对角线  差为0
        int he = last[0] + last[1];//副对角线  和均为2
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == key) {
                int[] move = moves[i];
                if (move[0] == last[0]) {
                    row++;
                }
                if (move[1] == last[1]) {
                    line++;
                }
                if (move[0] - move[1] == cha) {
                    zheng++;
                }
                if (move[0] + move[1] == he) {
                    fu++;
                }
            }
        }
        if (row >= 3 || line >= 3 || zheng >= 3 || fu >= 3) {
            return key == 0 ? "A" : "B";
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }

}
