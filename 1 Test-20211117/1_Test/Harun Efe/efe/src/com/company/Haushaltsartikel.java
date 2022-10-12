package com.company;

public class Haushaltsartikel extends Produkt{
    public boolean spezifikum;
    public Haushaltsartikel(double preis, double gewicht, boolean spezifikum) {
        super(preis, gewicht);
        this.spezifikum=spezifikum;
    }
}
