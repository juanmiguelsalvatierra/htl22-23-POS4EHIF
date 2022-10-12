package com.company;

public abstract class Produkt {
    public String art;
    public int preis;
    public int gewicht;

    public Produkt(String art, int preis, int gewicht){
        this.art = art;
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
