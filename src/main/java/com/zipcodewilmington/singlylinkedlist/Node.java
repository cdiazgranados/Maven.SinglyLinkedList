package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {
    //public class Node<E extends Comparable <E>> implements Comparable<Node<E>> {
    T data;

    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public void setData(T data) {
        this.data = data;
    }
}
