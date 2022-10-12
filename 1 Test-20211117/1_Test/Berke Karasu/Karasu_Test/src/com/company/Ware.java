package com.company;

public class Ware {
    public double preis, gewicht;
    public Ware next;

    public Ware(double preis, double gewicht){
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
