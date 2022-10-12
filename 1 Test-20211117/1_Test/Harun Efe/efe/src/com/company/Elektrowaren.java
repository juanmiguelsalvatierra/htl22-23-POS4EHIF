package com.company;

public class Elektrowaren extends Produkt{
    public double spezifikum;
    public Elektrowaren(double preis, double gewicht, double spezifikum) {
        super(preis, gewicht);
        this.spezifikum = spezifikum;
    }
}
