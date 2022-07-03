package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.LinkedList;

/**
 * 课程表
 * <p>
 * 思路：类似拓扑排序，首先统计需要学习的课的入度  然后将入度为0的入队，然后将与入队相关的课程入度减一，看最后出队元素是否等于所有课程
 */
public class title207 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        LinkedList<Integer> queue = new LinkedList<>();
        int count = 0;//统计能学完的课程
        int input[] = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {//统计需要学习的课的入度
            int course = prerequisites[i][0];
            input[course]++;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                queue.addLast(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer node = queue.removeFirst();//入度为0的课程
            count++;
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == node) {
                    int pre = prerequisites[i][0];
                    input[pre]--;
                    if (input[pre] == 0) {
                        queue.addLast(pre);
                    }
                }
            }
        }
        return count == numCourses;
    }

}
