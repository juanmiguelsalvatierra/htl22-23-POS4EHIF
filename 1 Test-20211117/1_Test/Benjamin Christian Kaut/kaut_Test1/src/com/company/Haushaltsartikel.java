package com.company;

import java.util.Random;

public class Haushaltsartikel extends Produktart{

    static Random rnd = new Random();

    int preis = rnd.nextInt(1500 + 1);
    double gewicht = rnd.nextInt(70);
    Boolean bio = rnd.nextBoolean();

    public Haushaltsartikel(String produkt, int preis, double gewicht, Boolean bio) {
        super(produkt);
        preis = this.preis;
        gewicht = this.gewicht;
        bio = this.bio;
    }

    @Override
    public String getInfo(){
        //preis = rnd.nextInt(1497 + 2);
        //gewicht = rnd.nextInt(70);
        //bio = rnd.nextBoolean();

        return "Preis: " + preis + ", gewicht: " + gewicht + ", bio: " + bio;
    }
}
