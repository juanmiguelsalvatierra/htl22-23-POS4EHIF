package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        String[] hersteller = {"Kids", "Freds" , "Marvins"};

        Produkt[][] produkte = new Produkt[3][1000];
        Produkt[][] clone = new Produkt[3][1000];//In dem Array steht nichts drinnen, es dient der Überprüfung ob produkte[][] leer ist
        Regal[] regale = new Regal[7];

        for (int i = 0; i < 1000; i++) {
            produkte[0][i] = new Elektrowaren(rnd.nextDouble() * 1498, rnd.nextDouble() * 69.5, rnd.nextDouble() * 2499.7 + 0.3);
            produkte[1][i] = new Spielwaren(rnd.nextDouble() * 1498, rnd.nextDouble() * 69.5, hersteller[rnd.nextInt(3)]);
            produkte[2][i] = new Haushaltsartikel(rnd.nextDouble() * 1498, rnd.nextDouble() * 69.5, rnd.nextBoolean());
        }

        for (int i = 0; i < regale.length; i++) {
            regale[i] = new Regal();
        }

        for (int i = 0; i < regale.length; i++) {
            Boolean nichtVoll = true;
            while(nichtVoll){
                if(Arrays.deepEquals(produkte, clone)){
                    break;
                }

                Produkt temp = null;
                int indexX = rnd.nextInt(3);
                int indexY = rnd.nextInt(1000);

                while(produkte[indexX][indexY] == null){
                    indexX = rnd.nextInt(3);
                    indexY = rnd.nextInt(1000);
                }

                temp = produkte[indexX][indexY];
                produkte[indexX][indexY] = null;

                nichtVoll = regale[i].hinzufuegen(temp);
            }
        }

        for (int i = 0; i < regale.length; i++) {
            regale[i].preisAenderungElektrowaren();
        }
    }
}
