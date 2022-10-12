package com.company;

public class Elektroware extends Produkt{
    Double watt;

    public Elektroware(int id,String produktArt, Double preis, Double gewicht,Double watt) {
        super(id,produktArt, preis, gewicht);
        this.watt = watt;

    }
}
