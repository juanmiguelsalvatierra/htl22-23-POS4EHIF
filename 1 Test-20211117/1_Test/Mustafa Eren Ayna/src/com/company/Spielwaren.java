package com.company;

public class Spielwaren extends Produkt{

    public String hersteller;

    public Spielwaren(int preis, Double gewicht, String hersteller) {
        super(preis, gewicht);
        this.hersteller = hersteller;
    }
}
