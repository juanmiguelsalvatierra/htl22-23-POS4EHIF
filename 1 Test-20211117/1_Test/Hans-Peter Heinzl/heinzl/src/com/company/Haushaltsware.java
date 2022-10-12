package com.company;

public class Haushaltsware extends Produkt {

    private String produktart;
    private float preis;
    private double gewicht;
    private boolean istBio;

    private Produkt next;

    public Haushaltsware(String produktart, float preis, double gewicht, boolean istBio) {
        super(produktart, preis, gewicht);
        this.istBio = istBio;
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

    public boolean getIstBio() {
        return istBio;
    }
    public void setIstBio(boolean istBio) {
        this.istBio = istBio;
    }

    @Override
    public void preisÄndern(double prozentwert) {
        super.preisÄndern(prozentwert);
    }
}
