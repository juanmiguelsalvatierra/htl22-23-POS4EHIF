package com.company;

public class Haushaltsartikel extends Produkt{
    public Boolean bio;
    public Haushaltsartikel(String art, int preis, int gewicht, Boolean bio) {
        super(art, preis, gewicht);
        this.bio = bio;
    }
}
