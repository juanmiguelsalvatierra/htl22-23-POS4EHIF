package com.company;

public class List {
    Node head;
    Node tail;

    public void addNode(Node next){
        if(head == null){
            head = next;
            tail = next;
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

    public Node suchen(int suchzahl){
        Node tmp = head;

        while(tmp != null){
            if(tmp.zahl == suchzahl){
                break;
            }
            tmp = tmp.next;
        }


        return tmp;
    }

    public void sortiertEinfuegen(Node newNode){
        if(head.zahl >= newNode.zahl){
            newNode.next = head;
            head.prior = newNode;
            head=newNode;
        } else
        if (tail.zahl < newNode.zahl){
            tail.next=newNode;
            newNode.prior = tail;
            tail = newNode;
        } else
        {
            Node tmp = head;
            while(tmp.zahl < newNode.zahl){
                tmp = tmp.next;
            }
            newNode.next = tmp;
            newNode.prior = tmp.prior;
            tmp.prior.next = newNode;
            tmp.prior = newNode;
        }
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
