package com.company;

public class Regal {

    public Produkt root;
    public Produkt next;

    private double maxTraglast = 21000;

    private double gewicht;
    private float gesamtpreis;

    private int anzElektrowaren = 0;
    private int anzSpielwaren = 0;
    private int anzHaushaltswaren = 0;

    private boolean voll = false;

    public boolean getVoll() {
        return voll;
    }

    public void add(Produkt item) {

        Produkt temp;

        if (root == null) {
            root = item;
        }
        else {
            temp = root;

            while (temp.hasNext()) {

                gewicht += temp.getGewicht();
                gesamtpreis += temp.getPreis();

                if (temp instanceof Elektroware) {
                    anzElektrowaren++;
                }
                else if (temp instanceof Spielware) {
                    anzSpielwaren++;
                }
                else if (temp instanceof Haushaltsware){
                    anzHaushaltswaren++;
                }

                temp = temp.getNext();
            }

            if (gewicht <= maxTraglast) {
                temp.setNext(item);
            }
            else {
                System.out.println("Elektrowaren: " + anzElektrowaren + ", Spielwaren: " + anzSpielwaren + ", Haushaltswaren: " + anzHaushaltswaren + "; Gesamtpreis: " + gesamtpreis);

                voll = true;
                return;
            }
        }
    }

    public void changeAllPrices(double prozentwert) {
        Produkt temp;

        if (root == null) {
            return;
        }
        else{
            temp = root;

            while (temp.hasNext()) {
                temp.preisÄndern(prozentwert);
                temp = temp.getNext();
            }
        }
    }
}
