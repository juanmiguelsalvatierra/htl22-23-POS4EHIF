package com.company;

public class Haushaltsartikel extends Produkt{
    public Boolean bio;

    public Haushaltsartikel(float preis, float gewicht, Boolean bio) {
        super(preis, gewicht);
        this.bio=bio;
    }
}
