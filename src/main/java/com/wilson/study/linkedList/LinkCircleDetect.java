package com.wilson.study.linkedList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 1. check if a link list has circle.
 * 2. find first node of circle if has circle.
 * Created by wilson on 2019/1/11.
 */
public class LinkCircleDetect {


    public static void main(String[] args) {
        Node head = buildLinkedList();
        System.out.println("has circle? " + (detectCircle(head) ? "Yes" : "No"));
        System.out.println("has circle? " + (detectCircleWithoutExtraSpace(head) ? "Yes" : "No"));

        Node circleListHead = buildLinkedListHasCircle();
        System.out.println("has circle? " + (detectCircle(circleListHead) ? "Yes" : "No"));
        System.out.println("has circle? " + (detectCircleWithoutExtraSpace(circleListHead) ? "Yes" : "No"));
    }

    /**
     * check given linked list weather has circle.
     * @param head
     * @return
     */
    public static Boolean detectCircle(Node head) {

        Set<Node> nodes = new HashSet<>();

        Node node = head;
        while (Objects.nonNull(node)) {
            if (nodes.contains(node)) {
                return Boolean.TRUE;
            }
            nodes.add(node);

            node = node.getNext();
        }

        return Boolean.FALSE;
    }

    public static Boolean detectCircleWithoutExtraSpace(Node node) {

        Node slow = node;
        if (Objects.isNull(slow)) {
            return false;
        }

        Node fast = node;
        while (Objects.nonNull(fast)) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (Objects.isNull(fast)) {
                return false;
            }

            if (slow.getValue() == fast.getValue()) {
                return true;
            }
        }

        return false;
    }

    private static Node buildLinkedList() {

        Node head = new Node();
        head.setValue(1);
        int i = 2;
        Node p = head;

        while (i < 7) {
            Node next = new Node();
            next.setValue(i);
            p.setNext(next);
            p = next;
            i++;
        }
        return head;
    }

    private static Node buildLinkedListHasCircle() {

        Node head = buildLinkedList();
        Node p = head;
        Node q = head.getNext();
        while (Objects.nonNull(q)) {
            p = p.getNext();
            q = q.getNext();
        }

        p.setNext(head);
        return head;
    }
}
