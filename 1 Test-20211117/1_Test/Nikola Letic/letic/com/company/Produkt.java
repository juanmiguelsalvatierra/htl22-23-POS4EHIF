package com.company;

public class Produkt {
    public float preis;
    public float gewicht;

    public Produkt next;
    public Produkt(float preis, float gewicht){
        this.preis = preis;
        this.gewicht=gewicht;
    }
}
