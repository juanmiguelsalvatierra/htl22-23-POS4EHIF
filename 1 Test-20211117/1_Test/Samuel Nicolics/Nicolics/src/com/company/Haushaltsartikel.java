package com.company;

public class Haushaltsartikel extends Produkt{

    boolean bio;

    public Haushaltsartikel(int preis, float gewicht, boolean bio){
        this.preis = preis;
        this.gewicht = gewicht;
        this.bio = bio;
    }
}
