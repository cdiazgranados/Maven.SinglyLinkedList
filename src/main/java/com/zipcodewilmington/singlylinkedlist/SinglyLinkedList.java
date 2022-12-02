package com.zipcodewilmington.singlylinkedlist;


import java.util.Collections;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> { //static?

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
            Node temp = head;
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

    public T getNodeData(int position) {
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }
        return (T) temp.getData();
    }

    public void setNodeDate(int position, T data) {
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }
        temp.setData(data);
    }

    public SinglyLinkedList<T> clone(){
        SinglyLinkedList<T> copy = new SinglyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < this.length; i++) {
            Node newNode = new Node(temp.getData());
            copy.add((T) newNode.getData());
            temp = temp.getNext();
        }
        return copy;
    }


    public SinglyLinkedList<T> sort(SinglyLinkedList<T> list){
       list = new SinglyLinkedList<>();

       T temp = list.getNodeData(0);
       Boolean sorted = false;

       while(sorted == false) {
           for(int i = 0; i < list.getLength() - 1; i++) {
               if (temp.compareTo(this.getNodeData(i)) > 0) {
//                   temp = input[i];
//                   input[i] = input[i + 1];
//                   input[i + 1] = temp;
                   temp = list.getNodeData(i);
//                   list.
                   sorted = false;
               }
           }
       }

//        Node<T> temp = head;
//        for (int i = 0; i < this.length; i++) {
//            if(temp.getData().compareTo(this.getNodeData(i)) > 0) {
//                copy.add(head.getData());
//                temp = temp.getNext();
//            } else {
//                copy.add(this.getNodeData(i));
//            }
//
//        }

        return list;
    }
}
