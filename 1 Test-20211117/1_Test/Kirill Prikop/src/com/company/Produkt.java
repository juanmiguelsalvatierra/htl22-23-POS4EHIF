package com.company;

public abstract class Produkt {
    String produktart;
    double preis, gewicht;

    public Produkt(String produktart,double preis, double gewicht){
        this.produktart= produktart;
        this.preis=preis;
        this.gewicht= gewicht;
    }
}
