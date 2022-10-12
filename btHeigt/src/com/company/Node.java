package com.company;

public class Node {
    public int data;
    public Node left = null;
    public Node right = null;

    public Node(int data) {
        this.data = data;
    }

    public int getHeightv1(int count) {
        if (left != null && right != null) {
            if (left.getHeightv1(count + 1) > right.getHeightv1(count + 1))
                return left.getHeightv1(count + 1);
            else
                return right.getHeightv1(count + 1);
        }

        if (left != null)
            return left.getHeightv1(count + 1);

        if (right != null)
            return right.getHeightv1(count + 1);

        return count;
    }

    public int getHeightv2(int count) {
        if (left != null && right != null) {
            if (left.getHeightv2(count) > right.getHeightv2(count))
                return left.getHeightv2(count) + 1;
            else
                return right.getHeightv2(count) + 1;
        }

        if (left != null)
            return left.getHeightv2(count) + 1;

        if (right != null)
            return right.getHeightv2(count) + 1;

        return count;
    }
}
