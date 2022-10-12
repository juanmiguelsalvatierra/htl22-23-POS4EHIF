package com.company;

public class Produkt {
    int id;
    String produktArt;
    Double preis;
    Double gewicht;
    Produkt next;

    public Produkt(int id,String produktArt, Double preis, Double gewicht){
        this.id= id;
        this.produktArt = produktArt;
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
