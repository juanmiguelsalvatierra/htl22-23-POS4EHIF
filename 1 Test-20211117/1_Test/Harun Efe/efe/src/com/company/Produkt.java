package com.company;

public class Produkt {
    public double preis, gewicht;
    public Produkt next;

    public Produkt(double preis, double gewicht){
        this.preis = preis;
        this.gewicht=gewicht;
    }

}
