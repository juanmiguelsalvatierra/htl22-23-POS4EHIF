package com.company;

public class Regal {
    public double tragelast;
    Ware root = null;

    Regal(double tragelast){
        this.tragelast = tragelast;
    }

    public void add(Ware w){
        if(root == null){
            root= w;
            return;
        }
        Ware temp = root;
        while(temp != null){
            temp = temp.next;
        }
    }
}
