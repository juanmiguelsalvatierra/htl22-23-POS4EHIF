package com.company;

public abstract class Produkt {
    public double preis;
    public double gewicht;

    public Produkt(double preis, double gewicht) {
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
