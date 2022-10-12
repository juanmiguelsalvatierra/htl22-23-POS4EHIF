package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Produkt[][] p = new Produkt[3][1000];
        Random rnd = new Random();
        String[] hersteller = {"Kids", "Freds", "Marvins"};

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if(i == 0){
                    double preis = rnd.nextInt(1498) + 3;
                    double gewicht = (rnd.nextInt(695) + 6) / 10;
                    double watt = (rnd.nextInt(24996) + 4) / 10;
                    p[i][j] = new Elektrowaren(preis,gewicht, watt);
                }
                else if(i == 1){
                    double preis = rnd.nextInt(1497) + 13;
                    double gewicht = (rnd.nextInt(695) + 8) / 10;
                    p[i][j] = new Spielwaren(preis,gewicht, hersteller[rnd.nextInt(3)]);
                }
                else{
                    double preis = ((double)rnd.nextInt(14980) + 19) / 10;
                    double gewicht = (rnd.nextInt(695) + 10) / 10;
                    p[i][j] = new Haushaltsartikel(preis,gewicht, rnd.nextBoolean());
                }
            }
        }

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {

            }
        }

        Regal[] regal = new Regal[7];
        for (int i = 0; i < regal.length; i++) {
            regal[i] = new Regal(0.0);
        }

        String[] art = {"Spielwaren", "Elektrowaren", "Haushaltsartikel"};

        int spielRunden = 0;
        int längeSpiel=1000;
        int längeElektro=1000;
        int längaHaus=1000;
        while (spielRunden < 7 || (längeSpiel + längaHaus + längeElektro) == 0){
            if(regal[spielRunden].traglast < 21000.0) {
                int a = rnd.nextInt(3);
                if (art[a] == "Spielwaren") {
                    int b = rnd.nextInt(1000);
                    if (p[a][b] != null) {
                        regal[spielRunden].traglast += p[a][b].gewicht;
                        regal[spielRunden].add(p[a][b]);
                        p[a][b] = null;
                        längeSpiel--;
                    }
                } else if (art[a] == "Elektrowaren") {
                    int b = rnd.nextInt(1000);
                    if (p[a][b] != null) {
                        regal[spielRunden].traglast += p[a][b].gewicht;
                        regal[spielRunden].add(p[a][b]);
                        p[a][b] = null;
                        längeElektro--;
                    }
                } else {
                    int b = rnd.nextInt(1000);
                    if (p[a][b] != null) {
                        regal[spielRunden].traglast += p[a][b].gewicht;
                        regal[spielRunden].add(p[a][b]);
                        p[a][b] = null;
                        längaHaus--;
                    }
                }
            }
            else{
                System.out.println(regal[spielRunden].toString());
                spielRunden++;
            }
        }

    }
}
