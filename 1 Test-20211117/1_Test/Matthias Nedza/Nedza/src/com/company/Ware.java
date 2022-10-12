package com.company;

public class Ware {
    public String produktart;
    public double preis;
    public double gewicht;
    public Ware next;

    Ware(String produktart, double preis, double gewicht){
        this.produktart = produktart;
        this.preis = preis;
        this.gewicht = gewicht;
    }


}
