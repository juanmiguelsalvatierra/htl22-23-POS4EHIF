package com.company;

import java.util.Random;


enum Hersteller{
    Kids,
    Freds,
    Marvins
}

public class Spielwaren extends Produktart{
    static Random rnd = new Random();

    int preis = rnd.nextInt(1500 + 1);
    double gewicht = rnd.nextInt(70);
    Hersteller hersteller;



    public Spielwaren(String produkt, int preis, double gewicht) {
        super(produkt);
        preis = this.preis;
        gewicht = this.gewicht;
        //this.hersteller = hersteller;

        int i = rnd.nextInt(3);
        if(i == 1)
            hersteller = hersteller.Kids;
        if(i == 2)
            hersteller = hersteller.Freds;
        else
            hersteller = hersteller.Marvins;
    }

    @Override
    public String getInfo(){
        //preis = rnd.nextInt(1499 + 11);
        //gewicht = rnd.nextInt(70);
        return "Preis: " + preis + ", gewicht: " + gewicht + ", hersteller: " + hersteller;
    }
}
