package com.LiKou.simple.sansiyuefen2022;


import java.util.ArrayList;
import java.util.Collections;


/**
 * 用方法一
 */
public class title206 {

    /**
     * 思路：直接将链表给到过来
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        if (head == null) {
            return null;
        }
        while (head != null) {
            ListNode next = head.next;//因为要断开，先保存下一个节点
            head.next = pre;
            pre = head;
            head = next;//head 移到原先的下一个节点
        }
        return pre;
    }

    //方法2：将链表值倒序
    public ListNode reverseList2(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList();
        ListNode cur = head;
        while (cur != null) {
            arrayList.add(cur.val);
            cur = cur.next;
        }
        Collections.reverse(arrayList);
        cur = head;
        for (Integer integer : arrayList) {
            cur.val = integer;
            cur = cur.next;
        }
        return head;
    }


    //节点定义
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
