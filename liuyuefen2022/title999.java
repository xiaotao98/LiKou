package com.LiKou.simple.liuyuefen2022;

/**
 * 可以被一步捕获的棋子数
 *
 * 思路：找到车的位置  然后上下左右判断即可
 */
public class title999 {

    public static int numRookCaptures(char[][] board) {
        int count = 0;
        int x = -1, y = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                }
            }
        }
        //右边
        for (int i = y + 1; i < board[x].length; i++) {
            if (board[x][i] == 'p') {
                count++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }
        //左边
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == 'p') {
                count++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }
        //下
        for (int i = x + 1; i < board.length; i++) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        //上
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }
        return count;
    }


}
