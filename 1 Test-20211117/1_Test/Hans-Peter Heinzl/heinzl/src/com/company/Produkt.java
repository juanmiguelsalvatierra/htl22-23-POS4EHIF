package com.company;

public class Produkt {

    private String produktart;
    private float preis;
    private double gewicht;

    private Produkt next;

    public Produkt(String produktart, float preis, double gewicht) {
        this.produktart = produktart;
        this.preis = preis;
        this.gewicht = gewicht;
    }

    public String getProduktart() {
        return produktart;
    }
    public void setProduktart(String produktart) {
        this.produktart = produktart;
    }

    public float getPreis() {
        return preis;
    }
    public void setPreis(float preis) {
        this.preis = preis;
    }

    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public Produkt getNext() {
        return next;
    }
    public void setNext(Produkt next) {
        this.next = next;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        }

        return true;
    }

    public void preisÄndern(double prozentwert) {
        float prozentsatz = (float)(preis * (prozentwert / 100));

        preis -= prozentsatz;
    }
}
