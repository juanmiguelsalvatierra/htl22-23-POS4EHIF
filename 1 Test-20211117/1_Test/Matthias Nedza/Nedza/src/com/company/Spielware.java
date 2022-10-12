package com.company;

public class Spielware extends Ware{
    public String spezifikum;

    Spielware(String produktart, double preis, double gewicht, String spezifikum) {
        super(produktart, preis, gewicht);
        this.spezifikum = spezifikum;
    }
}
