package com.company;

public class Elektrowaren extends Produkt {

    public  Double watt;

    public Elektrowaren(int preis, Double gewicht , Double watt) {
        super(preis, gewicht);
        this.watt = watt;
    }
}
