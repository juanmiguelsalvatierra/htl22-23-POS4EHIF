package com.company;

public class Regal {
    public Produkt root;
    public double gewicht = 0;

    public Boolean hinzufuegen(Produkt p){
        if(gewicht > 21000){
            statisitk();
            return false;
        }

        if(root == null){
            root = p;
        }else{
            Produkt temp = root;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = p;
        }
        gewicht += p.gewicht;
        return true;
    }

    public void statisitk(){
        Produkt temp = root;
        double counterPreis = 0;
        int counterElektrowaren = 0, counterSpielwaren = 0, counterHaushaltsartikel = 0;

        while(temp.next != null){
            counterPreis += temp.preis;

            if(temp instanceof Elektrowaren){
                counterElektrowaren++;
            }
            if(temp instanceof  Spielwaren){
                counterSpielwaren++;
            }
            if(temp instanceof Haushaltsartikel){
                counterHaushaltsartikel++;
            }
            temp = temp.next;
        }

        System.out.println("Gesamt Preis: " + counterPreis);
        System.out.println("Anz Elektrowaren: "+counterElektrowaren + " Anz Spielwaren: " +counterSpielwaren +" Anz Haushaltsartikel :" + counterHaushaltsartikel);
    }

    public void preisAenderungElektrowaren(){
        if(root == null){
            return;
        }

        Produkt temp = root;
        while(temp.next != null){
            if(temp instanceof Elektrowaren){
                temp.preis = temp.preis * 0.9;
            }
            temp = temp.next;
        }
    }
}
