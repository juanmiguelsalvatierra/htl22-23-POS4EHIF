package com.company;

public class Main {

    public static void main(String[] args) {

        List list = new List();

        list.addNode(new Node(7));
        list.addNode(new Node(3));
        list.addNode(new Node(9));
        list.addNode(new Node(2));
        list.addNode(new Node(1));

        list.removeNode(9);
        list.all();
        System.out.println("---");
        list.allBack();
    }
}
