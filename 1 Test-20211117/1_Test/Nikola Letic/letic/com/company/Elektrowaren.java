package com.company;

public class Elektrowaren extends Produkt{


    public float watt;

    public Elektrowaren(float preis, float gewicht, float watt) {
        super(preis, gewicht);
        this.watt=watt;
    }

}
