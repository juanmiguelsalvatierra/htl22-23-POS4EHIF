package com.company;

public class Produktart {

    String produkt;
    int preis = 0;
    double gewicht = 0.0;
    String spezifikum = "";
    public Produktart next;

    public Produktart(String produkt){
        this.produkt = produkt;
        this.preis = preis;
        this.gewicht = gewicht;
        this.spezifikum = spezifikum;
    }


    public String getInfo(){
        return produkt;
    }
}
