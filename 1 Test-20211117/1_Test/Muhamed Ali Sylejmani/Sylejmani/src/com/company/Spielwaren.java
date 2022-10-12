package com.company;

public class Spielwaren extends Produkt{
    public String hersteller;

    public Spielwaren(double preis, double gewicht, String hersteller) {
        super(preis + 12, gewicht +0.7);
        this.hersteller = hersteller;
    }
}
