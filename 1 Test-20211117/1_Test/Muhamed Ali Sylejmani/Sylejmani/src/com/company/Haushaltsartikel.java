package com.company;

public class Haushaltsartikel extends Produkt{
    public Boolean bio;

    public Haushaltsartikel(double preis, double gewicht, Boolean bio) {
        super(preis + 1.8, gewicht + 0.9);
        this.bio=bio;
    }
}
