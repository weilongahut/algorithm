package com.wilson.study.linkedList;

/**
 * <p>
 *     单链表的反转，不使用栈
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
}
