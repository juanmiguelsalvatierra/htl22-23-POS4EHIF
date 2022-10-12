package com.company;

public class Regal {

    public float gewicht=0;
    public Produkt root= null;

    public Regal next;

    public void addProdukt(Produkt p){
        if(root == null){
            root=p;
        }else{
            Produkt temp=root;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next=p;
        }
        gewicht+=p.gewicht;
    }

    public void ausgabe(int anzArten){
        Produkt temp= root;
        int[][] anz = new int[1][anzArten];
        float gesamtpreis=0;
        while (temp != null) {

            if(temp instanceof Elektrowaren){ anz[0][0]++;}
            if(temp instanceof Spielwaren){ anz[0][1]++;}
            if(temp instanceof Haushaltsartikel){ anz[0][2]++;}
            gesamtpreis+=temp.preis;
            temp=temp.next;
        }
        System.out.println("Anzahl der Elektrowaren: " + anz[0][0] );
        System.out.println("Anzahl der Spielwaren: " + anz[0][1] );
        System.out.println("Anzahl der Hausartikel: " + anz[0][2] );
        System.out.println("gesamtpreis der Produkte im Regal: " + gesamtpreis + " €");
    }

    public void preissenkungew(){
        Produkt temp= root;
        while (temp != null) {
            if(temp instanceof Elektrowaren){
                temp.preis *= 0.9;
            }
            temp=temp.next;
        }
    }
}
