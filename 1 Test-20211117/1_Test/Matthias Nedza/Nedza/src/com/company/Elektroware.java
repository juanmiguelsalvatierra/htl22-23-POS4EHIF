package com.company;

public class Elektroware extends Ware{
    public double spezifikum;

    Elektroware(String produktart, double preis, double gewicht, double spezifikum) {
        super(produktart, preis, gewicht);
        this.spezifikum = spezifikum;
    }
}
