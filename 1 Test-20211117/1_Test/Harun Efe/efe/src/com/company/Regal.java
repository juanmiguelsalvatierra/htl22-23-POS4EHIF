package com.company;

public class Regal {
    Produkt root;
    public double traglast;
    public Regal(double traglast){
        this.traglast = traglast;
    }

    public void add(Produkt a){
        if(root == null){
            root=a;
            return;
        }

        Produkt tmp = root;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = a;
    }

    //@Override
    public String toString(){
        if(root == null) return "Regal ist Leer!";
        int anzE = 0;
        int anzS = 0;
        int anzH = 0;
        double sumPreis = 0.0;
        Produkt tmp = root;

        while (tmp != null){
            if(tmp instanceof Elektrowaren) anzE++;
            if(tmp instanceof Spielwaren) anzS++;
            if(tmp instanceof Haushaltsartikel) anzH++;
            sumPreis += tmp.preis;
            tmp = tmp.next;
        }

        return "Anzahl Elektrowaren: " + anzE + ", Anzahl Spielwaren: " + anzS + ", Anzahl Haushaltsartikel: " + anzH + ", Summe Preis: " + sumPreis;
    }
}
