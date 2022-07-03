package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 出现次数最多的子树元素和
 * <p>
 * 思路：首先利用一个map保存所有节点的和以及对应的出现次数（关键），然后求出map中value最大值对应的Key
 * 求出map中value最大值对应的Key有两个办法：1 利用entryset和list   2用max记录下最大value  然后找key
 */
public class title508 {
/*
    int max = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        sum(root, map);
        //然后求出map中value最大值对应的Key
*//*    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        Integer max = list.get(0).getValue();*//*
        List<Integer> rst = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getValue() == max) {
//                rst.add(list.get(i).getKey());
//            } else {
//                break;
//            }
//        }
        for (Integer i : map.keySet()) {
            if (map.get(i)==max){
                rst.add(i);
            }
        }
        int[] arr = new int[rst.size()];
        for (int i = 0; i < rst.size(); i++) {
            arr[i] = rst.get(i);
        }
        return arr;
    }

    public int sum(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        int l = sum(root.left, map);//左子树和
        int r = sum(root.right, map);//右子树和
        int val = l + r + root.val;
        map.put(val, map.getOrDefault(val, 0) + 1);
        max=Math.max(max,map.get(val));
        return val;
    }
    */

}
