package com.company;

public class WarenRegal{
    public Produkt root;
    public Produkt produkt;
    public double gewicht;
    public boolean voll; // boolean für das abfragen ob das Regal die Traglast überschritten hat

    public WarenRegal(Produkt produkt){
        this.produkt = produkt;
    }

}
