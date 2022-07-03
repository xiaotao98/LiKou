package com.LiKou.simple.sansiyuefen2022;

/**
 * 返回两个链表相交的起始节点
 * 思路：
 * 设k为两个链表公共长度
 * 链表A：a+k
 * 链表B：b+k
 * 若k为0，代表没有相交的节点
 * p1遍历a链表，遍历完了，继续遍历b链表
 * p2遍历b链表，遍历完了，继续遍历a链表
 * 原理：两个链表走的路径都是一样的：a+k+b=b+k+a
 */
public class title160 {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 != null) {
                p1 = p1.next;
            } else {
                p1 = headB;
            }

            if (p2 != null) {
                p2 = p2.next;
            } else {
                p2 = headA;
            }
        }
        return p1;//返回p1和p2其中一个即可
    }

    /**
     * 这个是暴力算法
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode11(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != null) {
            while (p2 != null) {
                if (p2 == p1) {
                    return p1;
                } else {
                    p2 = p2.next;
                }
            }
            p2 = headB;
            p1 = p1.next;
        }
        return p1;
    }


}
