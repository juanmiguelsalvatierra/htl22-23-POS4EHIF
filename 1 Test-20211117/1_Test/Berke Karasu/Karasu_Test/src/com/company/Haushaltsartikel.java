package com.company;

public class Haushaltsartikel extends Ware{
    boolean bio;

    public Haushaltsartikel(double preis, double gewicht, boolean bio) {
        super(preis, gewicht);
        this.bio = bio;
    }
}
