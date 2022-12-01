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

    public int getPosition(T data) {
        Node<T> temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                return pos;
            }
            pos++;
            temp = temp.getNext(); //needs to return next node!
        }
        return -1;
    }
    public void remove(int position) {
        if (position == 0) {
            head = head.getNext();
        } else {
            Node temp =head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length--;
    }

    public int getLength() {
        return length;
    }

    public boolean contains(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }


}
