package com.company;

public class Spielwaren extends Produkt{
    public String spezifikum;
    public Spielwaren(double preis, double gewicht, String spezifikum) {
        super(preis, gewicht);
        this.spezifikum=spezifikum;
    }
}
