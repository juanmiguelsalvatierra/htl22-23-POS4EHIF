package com.company;

public class Haushaltsartikel extends Ware{
    public boolean bio;

    Haushaltsartikel(String produktart, double preis, double gewicht, boolean bio) {
        super(produktart, preis, gewicht);
        this.bio = bio;
    }
}
