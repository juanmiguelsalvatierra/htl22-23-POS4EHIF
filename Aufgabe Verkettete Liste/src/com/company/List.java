package com.company;

public class List {
    Node head;
    Node tail;

    public void addNode(Node next){
        if(head == null){
            head = next;
            return;
        }
        Node laufe = head;
        while(laufe.next != null){
            laufe = laufe.next;
        }
        next.prior = laufe;
        laufe.next = next;
        tail = next;
    }

    public void removeNode(int index){
        if(head == null){
            return;
        }

        Node laufe = head;
        Node laufePrev = head;
        while(laufe.zahl != index){
            laufePrev = laufe;
            laufe = laufe.next;
        }
        laufePrev.next = laufe.next;
        laufe.next.prior = laufePrev;
    }

    public void all(){
        if(head == null){
            System.out.println("Liste leer");
            return;
        }
        Node laufe = head;
        while(laufe != null){
            System.out.println(laufe.zahl);
            laufe = laufe.next;
        }
    }
    public void allBack(){
        if(tail == null){
            System.out.println("Liste leer");
            return;
        }
        Node laufe = tail;
        while(laufe != null){
            System.out.println(laufe.zahl);
            laufe = laufe.prior;
        }
    }
}
