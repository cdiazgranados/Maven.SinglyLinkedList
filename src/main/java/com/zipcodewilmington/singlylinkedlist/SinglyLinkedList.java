package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> { //static?

    Node<T> head;

    private int length = 0;

    SinglyLinkedList() {
        this.head = null;
    }

    void add(T data) {
        Node<T> temp = new Node<>(data);

        if (this.head == null) {
            head = temp;
        } else {
            Node<T> X = head;

            while (X.next != null) {
                X = X.next;
            }

            X.next = temp;
        }
        length++;
    }

    void remove(T key) {

    }


}
