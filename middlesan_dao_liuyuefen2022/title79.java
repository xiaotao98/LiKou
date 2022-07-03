package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 单词搜索
 */
public class title79 {
    /**
     * 思路：从头开始遍历，回溯
     */
    boolean find = false;
    public boolean exist(char[][] board, String word) {
        if (board == null) {
            return false;
        }
        int x = board.length;
        int y = board[0].length;
        boolean[][] visit = new boolean[x][y];//看此处坐标是否访问过
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                judge(i, j, board, word, visit, 0);
            }
        }
        return find;
    }

    /**
     *i，j为坐标  visit访问数组   index比较索引
     */
    private void judge(int i, int j, char[][] board, String word, boolean[][] visit, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || find || visit[i][j] || board[i][j] != word.charAt(index)) {
            return;//只要符合这些条件  直接返回
        }
        if (index == word.length() - 1) {//判断是否已经比较到组后一个
            find = true;
            return;
        }
        index++;//比较索引+1
        visit[i][j] = true;//将访问过的点设置为true
        judge(i - 1, j, board, word, visit, index);
        judge(i + 1, j, board, word, visit, index);
        judge(i, j + 1, board, word, visit, index);
        judge(i, j - 1, board, word, visit, index);
        visit[i][j] = false;//回溯
    }

}
