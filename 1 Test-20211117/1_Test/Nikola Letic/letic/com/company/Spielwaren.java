package com.company;

public class Spielwaren extends Produkt{

    public String hersteller;

    public Spielwaren(float preis, float gewicht, String hersteller) {
        super(preis, gewicht);
        this.hersteller=hersteller;
    }
}
