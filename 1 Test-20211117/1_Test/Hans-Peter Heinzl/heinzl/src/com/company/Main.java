package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rnd = new Random();

        String[] hersteller = new String[3];

        hersteller[0] = "Kids";
        hersteller[1] = "Freds";
        hersteller[2] = "Marvins";

        Produkt[][] altesRegal = new Produkt[3][1000];

        for (int i = 0; i < altesRegal.length; i++) {
            for (int j = 0; j < altesRegal[i].length; j++) {

                switch(i) {
                    case 0:
                        altesRegal[i][j] = new Elektroware("Elektroware", 2 + rnd.nextFloat() * 1501, 0.5 + rnd.nextDouble() * 71,0.3 + rnd.nextDouble() * 2501);
                        break;
                    case 1:
                        altesRegal[i][j] = new Spielware("Spielware", 12 + rnd.nextFloat() * 1511, 0.7 + rnd.nextDouble() * 70.3, hersteller[rnd.nextInt() * 4]);
                        break;
                    case 2:
                        altesRegal[i][j] = new Haushaltsware("Haushaltsware", 1.8f + rnd.nextFloat() * 1499.9f, 0.9 + rnd.nextDouble() * 70.5, rnd.nextBoolean());
                        break;
                }
            }
        } // altes Regal befüllen

        Regal[] neueRegale = new Regal[7];

        for (int i = 0; i < altesRegal.length * altesRegal[i].length; i++) {

            int rndX = rnd.nextInt() * 4;
            int rndY = rnd.nextInt() * 1001;

            for (int j = 0; j < neueRegale.length; j++) {
                while (!(neueRegale[i].getVoll())) {

                    if (altesRegal[rndX][rndY] != null) {

                        Produkt rndProdukt = altesRegal[rndX][rndY];
                        altesRegal[rndX][rndY] = null;

                        neueRegale[i].add(rndProdukt);
                    }

                }
            }
        }
    }
}
