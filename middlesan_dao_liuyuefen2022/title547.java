package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class title547 {
    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int i = findCircleNum(isConnected);
        System.out.println(i);

    }

    public static int findCircleNum(int[][] isConnected) {
        boolean visit[] = new boolean[isConnected.length];// 数组用来标记当前城市是否访问过
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visit[i]) {
                count++;// visit[i]为false 说明没有访问过
                dfs(isConnected, visit, i);// 遍历与这个城市相连的其他城市，让对应的visit值转为true
            }
        }
        return count;
    }

    public static void dfs(int[][] isConnected, boolean visit[], int i) {
        for (int j = 0; j < isConnected[i].length; j++) {// 遍历每一个元素
            if (isConnected[i][j] == 1 && visit[j] == false) {// 找到相连且未访问过的其他城市
                visit[j] = true;
                dfs(isConnected, visit, j);
            }
        }
    }
}
