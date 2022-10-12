package com.company;

import java.util.Random;

public abstract class Produkt {
    Random generiert = new Random();
    public String art;
    public double preis;
    public double gewicht;

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = generiert.nextDouble();
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = generiert.nextDouble();
    }
}
