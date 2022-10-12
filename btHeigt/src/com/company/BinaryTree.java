package com.company;

public class BinaryTree {
    Node root = null;

    public void add_rekursiv(int data){
        if(root == null)
            root = new Node(data);
        else
            add_rekursiv(root, data);
    }

    public int getHeightv1() {
        if (root == null) {
            return 0;
        }

        return getHeightv1(root, 0) - 1;
    }

    public int getHeightv2() {
        if (root == null) {
            return 0;
        }

        return getHeightv2(root, 0) - 1;
    }

    public int getHeightInNodev1() {
        if (root == null) {
            return 0;
        }

        return root.getHeightv1(0);
    }

    public int getHeightInNodev2() {
        if (root == null) {
            return 0;
        }

        return root.getHeightv2(0);
    }

    private void add_rekursiv(Node n, int data){
        if(data < n.data){
            if(n.left == null){
                n.left = new Node(data);
            }else{
                add_rekursiv(n.left, data);
            }
        }else{
            if(n.right == null)
                n.right = new Node(data);
            else
                add_rekursiv(n.right, data);
        }
    }

    private int getHeightv1(Node current, int count) {
        if (current != null) {
           if (getHeightv1(current.left, count + 1) > getHeightv1(current.right, count + 1))
               return getHeightv1(current.left, count + 1);
           else
               return getHeightv1(current.right, count + 1);
        }

        return count;
    }

    private int getHeightv2(Node current, int count) {
        if (current!= null) {
            if (getHeightv1(current.left, count) > getHeightv1(current.right, count))
                return getHeightv2(current.left, count) + 1;
            else
                return getHeightv2(current.right, count) + 1;
        }

        return count;
    }
}
