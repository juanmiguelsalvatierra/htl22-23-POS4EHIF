package com.company;

public class BBaum {

    public Knoten root = null;
    public void ausgabe(){
        ausgabe(root);
    }

    public void ausgabe(Knoten k){
        if (k!=null) {
            System.out.println(k.zahl);
            ausgabe(k.links);
            ausgabe(k.rechts);
        }
    }
    public int getHeight(){
        if (root == null){
            return 0;
        }
        return getHeight(root, 0);
    }

    public int getHeight(Knoten k, int count){
        if(k != null){
            int heightlinks = getHeight(k.links, count++);
            int heightrechts = getHeight(k.rechts, count++);
            if(heightlinks > heightrechts){
                return heightlinks;
            } else{
                return heightrechts;
            }
        }
        return count--;
    }

    public void infixAusgabe(Knoten k){
        if(k!=null){
            infixAusgabe(k.links);
            System.out.println(k.zahl);
            infixAusgabe(k.rechts);
        }
    }

    public void postfixAusgabe(Knoten k){
        if(k!=null){
            postfixAusgabe(k.links);
            postfixAusgabe(k.rechts);
            System.out.println(k.zahl);
        }
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Knoten addRecursive(Knoten current, int data) {
        if (current == null) {
            return new Knoten(data);
        }

        if (data < current.zahl) {
            current.links = addRecursive(current.links, data);
        } else if (data > current.zahl) {
            current.rechts = addRecursive(current.rechts, data);
        }

        return current;
    }



    /*public void einfuegen(int zahl){
        Knoten tmp = wurzel;
        boolean ein     gefuegt = false;
        if (wurzel == null){
            wurzel = new Knoten(zahl);
        } else {
            while (!eingefuegt) {
                if (tmp.zahl > zahl) {                   // links einfügen
                    if (tmp.links == null) {
                        tmp.links = new Knoten(zahl);
                        eingefuegt = true;
                    } else {
                        tmp = tmp.links;
                    }
                } else {                                // rechts einfügen
                    if (tmp.rechts == null) {
                        tmp.rechts = new Knoten(zahl);
                        eingefuegt = true;
                    } else {
                        tmp = tmp.rechts;
                    }
                }
            }
        }
    }*/
}
