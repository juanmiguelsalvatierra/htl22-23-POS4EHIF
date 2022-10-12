package com.company;

public class Node {
    public String wert = null;
    public Node left = null;
    public Node right = null;

    private Postion root = null;

    public Node(String wert, int position) {
        this.wert = wert;
        add(position);
    }

    public void add(int position) {
        if (root == null) {
            root = new Postion(position);
            return;
        }

        Postion temp = root;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Postion(position);
    }

    public void addPosition(int position) {
        add(position);
    }

    public String getPositions() {
        Postion temp = root;
        String positions = " ";

        while (temp != null) {
            positions += temp.position + " ";
            temp  = temp.next;
        }

        return positions;
    }

    private class Postion {
        protected int position;
        protected  Postion next;

        protected Postion(int position) {
            this.position = position;
        }
    }
}
