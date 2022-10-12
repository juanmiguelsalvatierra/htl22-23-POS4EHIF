package com.company;

public class Elektrowaren extends Waren{
    public double spez;
    public Elektrowaren(double preis, double gewicht, double spez) {
        super(preis, gewicht);
        this.spez=spez;
    }
}
