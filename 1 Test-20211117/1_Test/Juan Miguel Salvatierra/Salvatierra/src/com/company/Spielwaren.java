package com.company;

public class Spielwaren extends Produkt{
    public int hersteller;
    public Spielwaren(String art, int preis, int gewicht, int hersteller) {
        super(art, preis, gewicht);
        this.hersteller = hersteller;
    }
}
