package com.company;

public class Spielware extends Produkt {

    private String produktart;
    private float preis;
    private double gewicht;
    private String hersteller;

    public Spielware(String produktart, float preis, double gewicht, String hersteller) {
        super(produktart, preis, gewicht);
        this.hersteller = hersteller;
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
        return super.getNext();
    }
    @Override
    public void setNext(Produkt next) {
        super.setNext(next);
    }

    public String getHersteller() {
        return hersteller;
    }
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    @Override
    public void preisÄndern(double prozentwert) {
        super.preisÄndern(prozentwert);
    }
}
