package com.company;

public class Spielware extends Ware{
    String hersteller;

    public Spielware(double preis, double gewicht, String hersteller) {
        super(preis, gewicht);
        this.hersteller = hersteller;
    }
}
