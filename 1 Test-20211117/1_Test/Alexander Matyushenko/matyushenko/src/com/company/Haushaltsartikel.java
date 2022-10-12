package com.company;

public class Haushaltsartikel extends Produkt{
    boolean bio;

    public Haushaltsartikel(int id,String produktArt, Double preis, Double gewicht,boolean bio) {
        super(id,produktArt, preis, gewicht);
        this.bio = false;
    }
}
