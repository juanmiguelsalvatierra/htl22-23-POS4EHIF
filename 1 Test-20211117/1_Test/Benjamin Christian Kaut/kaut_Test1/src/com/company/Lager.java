package com.company;

public class Lager {

    public Produktart root = null;

    public Lager(){}

    public void add(Produktart p){
        if(root == null){
            root = p;
            return;
        }

        Produktart tmp = root;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = p;
    }

    @Override
    public String toString(){
        System.out.println("Lager: ");

        String art = "";
        String s = "";

        Produktart tmp = root;

        while(tmp != null){
            if(tmp instanceof Elektrowaren)
                art = " Elektrowaren";
            if(tmp instanceof Spielwaren)
                art = " Spielwaren";
            if(tmp instanceof Haushaltsartikel)
                art = " Haushaltsartikel";

            s += art + ", " + tmp.getInfo();
            tmp = tmp.next;
        }
        return s;
    }
}
