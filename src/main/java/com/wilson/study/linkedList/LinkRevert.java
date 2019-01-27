package com.wilson.study.linkedList;

/**
 * <p>
 *     单链表的反转，不使用栈
 *
 * </p>
 * Created by wilson on 16/09/2017.
 */
public class LinkRevert {

    public Node revert(Node head) {

        Node newHead = null;

        for (Node p = head; p != null; ) {
            Node temp = p.getNext();
            p.setNext(newHead);
            newHead = p;
            p = temp;
        }
        return newHead;
    }

    public Node revert2(Node head) {

        if (head == null) {
            return head;
        }

        head = recursionRevert(head);
        return head;
    }

    public Node reverseBetween(Node head, int m, int n) {
        if (head == null
                || head.getNext() == null) {
            return head;
        }

        if (m == n
                || m <= 0
                || n <= 0) {
            return head;
        }

        int cursor = 1;
        Node start = null;
        Node end = null;
        Node newSegmentHead = null;
        Node newSegmentTail = null;
        for (Node p = head; cursor <= n;) {
            if (cursor == m - 1) {
                start = p;
                p = p.getNext();
            } else if (cursor >= m && cursor <= n) {
                if (newSegmentTail == null) {
                    newSegmentTail = p;
                }

                Node temp = p.getNext();
                p.setNext(newSegmentHead);
                newSegmentHead = p;
                p = temp;
                end = temp;
            } else {
                p = p.getNext();
            }

            cursor ++;
        }

        start.setNext(newSegmentHead);
        newSegmentTail.setNext(end);

        return head;

    }

    private Node recursionRevert(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        } else {

            Node newHead = recursionRevert(head.getNext());
            head.getNext().setNext(head);
            head.setNext(null);
            return newHead;
        }

    }
}
