package com.company;

public class Elektrowaren extends Produkt{
    public int watt;

    public Elektrowaren(String art, int preis, int gewicht, int watt){
        super(art, preis, gewicht);
        this.watt = watt;
    }
}
