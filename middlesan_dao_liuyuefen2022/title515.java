package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 在每个树行中找最大值
 * <p>
 * 思路1：DFS+记录深度   将行数以及每行的最大值存入到map中   不断更新map即可
 *
 * 思路2：BFS
 */
public class title515 {

/*
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    public List<Integer> largestValues(TreeNode root) {
        dfs(root, 0);
        for (int i = 0; i < map.size(); i++) {
            list.add(map.get(i));
        }
        return list;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(depth)) {//不包含这个深度，直接放到map
            map.put(depth, root.val);
        } else if (map.get(depth) < root.val) {//包含这个深度，需要比较大小
            map.put(depth, root.val);
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
    */

/**
 * BFS
 */
/*
    List<Integer> list=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        BFS(root);
        return list;
    }

    public void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = queue.peek().val;//先取队首值
            int size = queue.size();//队列大小，因为每一行最大值会在这些值里面产生
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                if (root.val>max){
                    max=root.val;
                }
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
            list.add(max);
        }
    }
    */

}
