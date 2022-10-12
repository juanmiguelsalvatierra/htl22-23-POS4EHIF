package com.company;

public class Elektrowaren extends Produkt{
    double watt;
    public Elektrowaren(double watt, double preis, double gewicht){
        super(preis, gewicht);
        this.watt = watt;
    }
}
