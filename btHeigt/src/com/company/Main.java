package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add_rekursiv(21);
        bt.add_rekursiv(11);
        bt.add_rekursiv(5);
        bt.add_rekursiv(1);
        bt.add_rekursiv(7);
        bt.add_rekursiv(25);
        bt.add_rekursiv(30);
        bt.add_rekursiv(23);
        bt.add_rekursiv(0);


        System.out.println("Binary Tree Height v1 in Tree: " + bt.getHeightv1());
        System.out.println("Binary Tree Height v2 in Tree: " + bt.getHeightv2());
        System.out.println("Binary Tree Height v1 in Node: " + bt.getHeightInNodev1());
        System.out.println("Binary Tree Height v2 in Node: " + bt.getHeightInNodev2());
    }
}
