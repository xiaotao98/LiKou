package com.LiKou.simple.sansiyuefen2022;

/**
 * 判断链表是否是环形链表：
 * 思路： head为空，返回false
 *       设定一个很大的数值x,x>10^5
 *       如果head.val=x返回true
 *       否则，就是令当前节点值为x，然后head=head.next
 */
public class title141 {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        if(head==null){
            return false;
        }
        while (head.next != null) {
            if (head.val == 1000000000) {
                return true;
            } else {
                head.val = 1000000000;
                head = head.next;
            }
        }
        return false;
    }

}
