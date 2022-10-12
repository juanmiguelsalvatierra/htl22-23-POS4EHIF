package com.company;

public class Spielwaren extends Waren{
    public int hersteller;
    public Spielwaren(double preis, double gewicht, int hersteller) {
        super(preis, gewicht);
        this.hersteller=hersteller;
    }
}
