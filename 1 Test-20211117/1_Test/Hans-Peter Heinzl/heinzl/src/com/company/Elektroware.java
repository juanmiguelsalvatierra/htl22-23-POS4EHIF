package com.company;

public class Elektroware extends Produkt {

    private String produktart;
    private float preis;
    private double gewicht;
    private double watt;

    private Produkt next;

    public Elektroware(String produktart, float preis, double gewicht, double watt) {
        super(produktart, preis, gewicht);
        this.watt = watt;
    }

    @Override
    public String getProduktart() {
        return produktart;
    }
    @Override
    public void setProduktart(String produktart) {
        this.produktart = produktart;
    }

    @Override
    public float getPreis() {
        return preis;
    }
    @Override
    public void setPreis(float preis) {
        this.preis = preis;
    }

    @Override
    public double getGewicht() {
        return gewicht;
    }
    @Override
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public Produkt getNext() {
        return next;
    }
    @Override
    public void setNext(Produkt next) {
        this.next = next;
    }

    public double getWatt() {
        return watt;
    }
    public void setWatt(double watt) {
        this.watt = watt;
    }

    @Override
    public void preisÄndern(double prozentwert) {
        super.preisÄndern(prozentwert);
    }
}
