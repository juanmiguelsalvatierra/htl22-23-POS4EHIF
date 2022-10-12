package com.company;

import java.util.Random;

public class Main {

    public static int zeile = 3;
    public static int spalte = 1000;

    public static void main(String[] args) {
	// write your code here

        Random rnd = new Random();
        Ware[][] altesregal = new Ware[zeile][spalte];

        String[] hersteller = {"Kids", "Freds", "Marvins"};

        //Regale befüllen
        for (int i = 0; i < spalte; i++) {
            altesregal[0][i] = new Elektroware("Elektroware", rnd.nextInt(2, 1501), rnd.nextInt((5, 700)/10), rnd.nextInt((3, 25000)/10));
            altesregal[1][i] = new Spielware("Spielware", rnd.nextInt(12, 1511), rnd.nextInt((7, 702)/10), hersteller[rnd.nextInt(0, 3)]);
            altesregal[2][i] = new Haushaltsartikel("Haushaltsartikel", rnd.nextInt((18, 14998))/10, rnd.nextInt((9, 704)/10), rnd.nextBoolean());
        }

        Regal r = new Regal(21000.0);
        int anzEletrkoware=0;
        int anzSpielware =0;
        int anzHaushaltsartikel=0;
        double gesamtpreis=0.0;

        while(r.tragelast <=21){
            for (int i = 0; i < zeile; i++) {
                for (int j = 0; j < spalte; j++) {
                    if(altesregal[i][j].produktart.equals("Elektroware")){

                        anzEletrkoware++;
                        gesamtpreis+= altesregal[i][j].preis;
                    }else{
                        if(altesregal[i][j].produktart.equals("Spielware")){

                            anzSpielware++;
                            gesamtpreis+= altesregal[i][j].preis;
                        }else{

                            anzHaushaltsartikel++;
                            gesamtpreis+= altesregal[i][j].preis;
                        }
                    }
                }
            }
        }
        System.out.println("Anzahl aller Elktrowaren: " + anzEletrkoware );
        System.out.println("Anzahl aller Spielwaren: " + anzSpielware );
        System.out.println("Anzahl aller Haushaltsartikelen: " + anzHaushaltsartikel );
        System.out.println("Gesamtpreis aller Artikel: " + gesamtpreis);
    }
}
