package com.company;

import java.util.Random;

public class Elektrowaren extends Produktart{

    static Random rnd = new Random();

    int preis = rnd.nextInt(1500 + 1);
    double gewicht = rnd.nextInt(70);
    double watt = rnd.nextInt(2500);

    public Elektrowaren(String produkt, int preis, double gewicht, double watt) {
        super(produkt);
        preis = this.preis;
        gewicht = this.gewicht;
        watt = this.watt;
    }

    @Override
    public String getInfo(){
        //preis = rnd.nextInt(1500 + 1);
        //gewicht = rnd.nextInt(70);
        //watt = rnd.nextInt(2500);
        return "Preis: " + preis + ", gewicht: " + gewicht + ", watt: " + watt;
    }

}
