package com.company;

import java.util.Random;

public class Main {

    public static Regal root = new Regal();
    public static Random rn = new Random();
    public static String arten[] = {"Elektrowaren", "Spielwaren", "Hausartikel"};
    public static int anzahlArten=3;
    public static int anzahlprodukte=1000;
    public static void main(String[] args) {


        Produkt[][] produkte = new Produkt[anzahlprodukte][anzahlArten];

        String hersteller[] = {"Kids", "Freds", "Marvins"};
        for (int i = 0; i < produkte.length; i++) {
                produkte[i][0] = new Elektrowaren((2 + rn.nextFloat()*1498), (0.5f + rn.nextFloat()*69.5f) , (0.3f + rn.nextFloat()*2499.7f));
                produkte[i][1] = new Spielwaren((12 + rn.nextFloat()*1498), (0.7f + rn.nextFloat()*69.5f) , hersteller[rn.nextInt(3)]);
                produkte[i][2] = new Haushaltsartikel((1.8f + rn.nextFloat()*1498), (0.9f + rn.nextFloat()*69.5f) , rn.nextBoolean());
            //die Werte die mit random multipliziert werden sind immer gleich, also falls es immer so bleibt könnte man eine variable für den maximalen Wert einrichten

        }
        //befüllen der neuen Regale:

        int regalcount = 7;
        int count=1;
        while(regalcount>count){
            add(new Regal());
            count++;
        }

        Regal temp = root;
        int produkteeingelagert=0;
        count =0;
        while(temp!= null){

            while((temp.gewicht < 21000) && (produkteeingelagert < anzahlprodukte*anzahlArten))
            {
                int art=0;
                int welches=0;
                do {
                    art = rn.nextInt(anzahlArten);
                    welches = rn.nextInt(anzahlprodukte);
                }while(produkte[welches][art] == null);
                temp.addProdukt(produkte[welches][art]);
                produkte[welches][art]=null;
                produkteeingelagert++;
            }
            //rasspringen, da wenn regal nicht voll keine ausgabe nötig
            if(temp.gewicht < 21000) {
                break;
            }
            temp.ausgabe(anzahlArten);
            temp=temp.next;
            if(temp!=null)
            {
                System.out.println("restlichen Produkte werden an einen anderen Standort gebracht");
            }
        }
        preissenkungew();

        //testen ob konditionen erfüllt:
        Ausgabetest();

    }

    public static void add(Regal r){
        if(root == null){
            root=r;
        }else{
            Regal temp = root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next =r;
        }
    }

    public static void preissenkungew(){

        Regal temp = root;
        while(temp!=null){
            temp.preissenkungew();
            temp=temp.next;
        }
        System.out.println("PREISE DER ELEKTROWAREN wurden gesenkt");
    }
    public static void Ausgabetest(){
        Regal temp = root;
        int count=1;
        while(temp!=null){
            System.out.println("****************************REGAL " + count + "****************************************");
            temp.ausgabe(anzahlArten);
            System.out.println("GEWICHT: " + temp.gewicht);
            temp=temp.next;
            count++;
        }
    }
}
