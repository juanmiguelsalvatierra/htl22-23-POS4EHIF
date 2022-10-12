package com.company;

import java.util.Random;

public class Main {

    static Random rnd = new Random();
    public static void main(String[] args) {
        int elektrocount = 0;
        int spielcount = 0;
        int haushaltcount = 0;
        float preisgesamt = 0;
        Regal r1[] = new Regal[3];
        //Befüllen der alten Regale
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 1000; i++) {
                r1[j].inRegal[i] = new Elektroware();
                r1[j].inRegal[i] = new Spielware();
                r1[j].inRegal[i] = new Haushaltsartikel();
            }
        }

        int maxregal = 0;
        Regal[] r = new Regal[];
        for (int j = 0; j < r.length; j++) {
            if (r[j].traglast > 0) {
                //Befüllung neue Regale
                for (int i = 0; i < 3; i++) {
                    while (r1[i].inRegal != null) {
                        Produkt ptmp = r1[0].inRegal[rnd.nextInt()];
                        r[j].inRegal[i] = ptmp;
                        if (ptmp instanceof Elektroware) {
                            elektrocount++;
                            ptmp.preis = ptmp.preis * 0.9;
                        } else if (ptmp instanceof Spielware) {
                            spielcount++;
                        } else {
                            haushaltcount++;
                        }
                        preisgesamt += ptmp.preis;
                    }


                }
                //Ausgabe nach vollem Regal
                System.out.println(elektrocount + " " + spielcount + " " + haushaltcount + "\n" + preisgesamt);
            }

        }
    }
}
