package com.company;

public class Spielware extends Produkt{
    String hersteller;

    public Spielware(int id,String produktArt, Double preis, Double gewicht,String hersteller) {
        super(id,produktArt, preis, gewicht);
        this.hersteller = hersteller;
    }
}
