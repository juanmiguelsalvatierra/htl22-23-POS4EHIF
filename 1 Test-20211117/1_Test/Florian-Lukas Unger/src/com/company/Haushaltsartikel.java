package com.company;

public class Haushaltsartikel extends Produkt{
    boolean bio;
    public Haushaltsartikel(boolean bio, double preis, double gewicht){
        super(preis, gewicht);
        this.bio = bio;
    }

}
