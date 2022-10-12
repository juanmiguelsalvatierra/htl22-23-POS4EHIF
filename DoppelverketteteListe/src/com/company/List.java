package com.company;

public class List {
    public Node head;
    public Node tail;

    public void addNode(Node neu){
        if (head.next == null){
            head.next = neu;
            tail = neu;
            tail.prior = head;
        }
        Node temp = head;
        while (temp != null){
            temp = temp.next;
        }
        temp.next = neu;
        tail = neu;
        tail.prior = temp;
    }

    public void removeNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }

    }
}
