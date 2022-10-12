package com.company;

public class Regale {

    public int traglast;

    public Regale(int traglast){
        this.traglast = 21000;
    }

    Produkt root = null;

    public void add(Produkt p){
        Produkt tmp = root;
        if(tmp == null){
            System.out.println("Regal leer!");
        }

        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp = p;
    }
}
