package com.company;

public class Produkt {
    public Produkt next;
    public int preis;
    public Double gewicht;

    public Produkt(int preis, Double gewicht){
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
