package com.company;

public class Elektrowaren extends Produkt{
    public double watt;

    public Elektrowaren(double preis, double gewicht, double watt) {
        super(preis + 2, gewicht + 0.5);
        this.watt = watt;
    }
}
