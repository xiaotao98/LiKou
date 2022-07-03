package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 剑指 Offer II 029. 排序的循环链表
 * <p>
 * 思路：如果头节点是空   将要插入的节点赋值给头节点，然后让插入的节点指向自己
 * 头节点不为空，设一个前指针和后指针，然后去找插入点，插入数值要么是中间值，要么是最大值或者最小值。
 */
public class offer_029 {

    /*
    public Node insert(Node head, int insertVal) {
        Node insert = new Node(insertVal);
        if (head == null) {
            head = insert;
            insert.next = insert;
            return head;
        }
        Node pre = head;
        Node next = head.next;
        while (next != head) {
            if (pre.val <= insertVal && next.val >= insertVal) {//说明插入的不是最大值或者最小值
                break;
            }
            if (pre.val > next.val && (insertVal >= pre.val || insertVal <= next.val)) {//判断一下  是否为  最大值或者最小值
                break;
            }
            pre = pre.next;
            next = next.next;
        }
        insert.next = next;
        pre.next = insert;
        return head;
    }
    */

/*
    public Node insert(Node head, int insertVal) {
        Node node = head;
        Node insert = new Node(insertVal);
        if (head == null) {
            head = insert;
            insert.next = insert;
            return head;
        }
        while (node.next != head) {
            if (node.val <= insertVal && node.next.val >= insertVal) {//说明插入的不是最大值或者最小值
                break;
            }
            if (node.val > node.next.val && (insertVal >= node.val || insertVal <= node.next.val)) {//判断一下  是否为  最大值或者最小值
                break;
            }
            node = node.next;
        }
        insert.next = node.next;
        node.next = insert;
        return head;
    }
    */

}
