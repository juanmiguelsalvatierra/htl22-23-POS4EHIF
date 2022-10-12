package com.company;

public class Elektrowaren extends Produkt {
    double watt;

    public Elektrowaren(String produktart,double preis, double gewicht, double watt){
        super(produktart, preis, gewicht);
        this.watt = watt;
    }

}
