package com.company;

public class Spielwaren extends Produkt{
    String hersteller;
    public Spielwaren(String hersteller, double preis, double gewicht){
        super(preis, gewicht);
        this.hersteller = hersteller;
    }
}
