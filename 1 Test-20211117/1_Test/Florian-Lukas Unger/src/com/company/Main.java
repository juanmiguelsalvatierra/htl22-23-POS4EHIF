package com.company;

import java.util.Random;

public class Main {

    public static Random rnd = new Random();
    public static void main(String[] args) {
        Produkt[][] regal = new Produkt[3][1000];
        Regalslot newRegal;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1000; j++) {
                if(i == 0){
                    regal[i][j] = new Elektrowaren(rnd.nextDouble()*2500,rnd.nextDouble()*1500,rnd.nextDouble()*70);// Random Funfktioniert nicht ich habe es zuhause mehrmals so gemacht aber es geht einfacht nicht ich habe keine ahnung warum und verstehe nicht was los ist es gibt kein random.next und random. double funkrioniert genauso wenig ich habe eine halbe stunde jetzt dran gesessen und es funktioniert noch immer nicht
                }
                if(i == 1){
                    regal[i][j] = new Spielwaren("hersteller",rnd.nextDouble()*1510, rnd.nextDouble()*70);
                }
                if(i == 2){
                    regal[i][j] = new Haushaltsartikel(rnd.nextBoolean(),rnd.nextDouble()*1500, rnd.nextDouble()*70);
                }
            }
        }
        //eigentlich abfrage welche produkte

        for (int i = 0; i < 3000; i++) {
            if (regal[i][i+8] instanceof Spielwaren){
                // liste einfügen keine zeit
            }
            if (regal[i][i+8] instanceof Elektrowaren){
                //list
            }
            if (regal[i][i+8] instanceof Haushaltsartikel){
                //list
            }
            //nach jedem mal die liste durchgehen und gewicht += produkt.gewicht
            //wenn gwicht >= 21000 kg neue liste nicht implimentiert for schleife eigentlich falsch
            //elektrowaren listen produkt.preis = produkt.peis * 0.1
        }



    }
}
