package com.company;

public class Spielwaren extends Produkt{
    public String hersteller;

    public Spielwaren(double preis, double gewicht,String hersteller){
        super(preis,gewicht);
        this.hersteller = hersteller;
    }
}
