package com.company;

public class Haushaltsartikel extends Produkt{
    Boolean bio;

    public Haushaltsartikel(String produktart,double preis, double gewicht,Boolean bio){
        super(produktart, preis, gewicht);
        this.bio = bio;
    }
}
