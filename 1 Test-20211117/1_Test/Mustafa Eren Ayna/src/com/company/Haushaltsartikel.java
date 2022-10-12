package com.company;

public class Haushaltsartikel extends Produkt{

    public boolean bio;

    public Haushaltsartikel(int preis, Double gewicht, boolean bio) {
        super(preis, gewicht);
        this.bio = bio;
    }
}
