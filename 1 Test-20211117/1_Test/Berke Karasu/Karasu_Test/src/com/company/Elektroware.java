package com.company;

public class Elektroware extends Ware{
    double watt;

    public Elektroware(double preis, double gewicht, double watt) {
        super(preis, gewicht);
        this.watt = watt;
    }
}
