package com.company;

public class Produkt{
    double preis, gewicht;

    public Produkt(double preis, double gewicht) {
        this.preis = preis;
        this.gewicht = gewicht;
    }

    public double Getpreis(){
        return preis;
    }

    public double Getgewicht(){
        return gewicht;
    }
}
