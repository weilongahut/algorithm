package com.wilson.study.linkedList;

import java.util.Objects;

/**
 * Created by wilson on 16/09/2017.
 */
public class Node {

    private int value;

    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(this.value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Node)) {
            return false;
        }
        return Objects.isNull(obj) ? false : ((Node) obj).getValue() == this.value;
    }
}
