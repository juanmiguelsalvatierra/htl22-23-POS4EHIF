package com.company;

public class Spielwaren extends Produkt{
    String hersteller;

    public Spielwaren(String produktart,double preis, double gewicht, String hersteller){
        super(produktart, preis, gewicht);
        this.hersteller = hersteller;
    }
}
