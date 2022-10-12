package com.company;

public class Produkt {
    public double preis;
    public double gewicht;
    public Produkt next;

    public Produkt(double preis, double gewicht){
        this.gewicht = gewicht;
        this.preis = preis;
    }
}
