package com.wilson.study.linkedList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by wilson on 16/09/2017.
 */
@RunWith(JUnit4.class)
public class LinkedTest {

    private Node node;

    @Before
    public void setUp() {
        node = buildLinkedList();
    }

    private Node buildLinkedList() {

        Node head = new Node();
        head.setValue(1);
        int i = 2;
        Node p = head;

        while (i < 5) {
            Node next = new Node();
            next.setValue(i);
            p.setNext(next);
            p = next;
            i++;
        }
        return head;
    }

    @Test
    public void testRevertLinkedList() {
        printLinkedList(this.node);
        LinkRevert linkRevert = new LinkRevert();
//        linkRevert.revert(this.node);
        printLinkedList(linkRevert.revert(this.node));

    }

    private void printLinkedList(Node node) {
        Node p = node;
        while (p != null) {
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }
}
