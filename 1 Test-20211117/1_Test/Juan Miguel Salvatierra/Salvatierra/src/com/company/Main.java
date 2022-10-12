package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rnd = new Random();
        int traglast = 0;
        Produkt[][] produkte = new Produkt[1000][7];
        for (int i = 0; i < 1000; i++) {
            produkte[i][0] = new Elektrowaren("Elektrowaren", rnd.nextInt(1498) + 2, rnd.nextInt(70), rnd.nextInt(2500));
            produkte[i][1] = new Spielwaren("Spielwaren", rnd.nextInt(1498) + 12, rnd.nextInt(70), rnd.nextInt(4));
            produkte[i][2] = new Haushaltsartikel("Haushaltsartikel", rnd.nextInt(1500), rnd.nextInt(70), rnd.nextBoolean());
        }
        int i = 0;
        int j = 4;
        int anze = 0;
        int anzs = 0;
        int anzh = 0;
        int gespreis = 0;
        int leercount = 0;
        while(true){
            if(traglast > 21000){
                System.out.println("Anzahl aller Elektrowaren: " + anze + " Anzahl aller Spielwaren: " + anzs + " Anzahl aller Haushaltsartikel: " + anzh);
                System.out.println(gespreis);
                anze = 0;
                anzs = 0;
                anzh = 0;
                gespreis = 0;
                traglast = 0;
                j++;
            }
            int art = rnd.nextInt(4);
            int rprodukt = rnd.nextInt(1000);
            if(art == 1){
                produkte[i][j] = produkte[rprodukt][1];
                gespreis += produkte[rprodukt][1].preis;
                traglast += produkte[rprodukt][1].gewicht;
                anze++;
                produkte[rprodukt][1] = null;
            }
            if(art == 2){
                produkte[i][j] = produkte[rprodukt][2];
                gespreis += produkte[rprodukt][2].preis;
                traglast += produkte[rprodukt][2].gewicht;
                anzs++;
                produkte[rprodukt][2] = null;
            }
            if(art == 3){
                produkte[i][j] = produkte[rprodukt][3];
                gespreis += produkte[rprodukt][3].preis;
                traglast += produkte[rprodukt][3].gewicht;
                anzh++;
                produkte[rprodukt][3] = null;
            }
            i++;
            for (int k = 0; k < 1000; k++) {
                for (int l = 0; l < 3; l++) {
                    if(produkte[k][l] != null){
                        leercount++;
                    }
                }
            }
            if(leercount == 0){
                break;
            }
        }

    }

}
