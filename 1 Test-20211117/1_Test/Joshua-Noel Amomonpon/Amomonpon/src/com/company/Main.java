package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int temp;
        Produkt[] produkte = new Produkt[3000];
        WarenRegal[][] warenregal = new  WarenRegal[10][1000]; // es gibt 3 Regale am anfang und es dürfen max 7 dazugegeben werden [10] die ersten 3 regale können 1000 produkte tragen.

        // Einfuegen der Produkte
        // ich habe vergessen wie man bei nachkomma stellen random macht, um das Program weiter zu schreiben umgehe ich das einfach
        for (int i = 0; i < 1000; i++) {
            produkte[0 + i] = new Elektrowaren(2 + rnd.nextInt(1500), 0.5 + rnd.nextInt(70), 0.3 + rnd.nextInt(2500));
            temp = rnd.nextInt(3);
            if (temp == 3){
                produkte[999+ i] = new Spielwaren(12 + rnd.nextInt(1510), 0.7 + rnd.nextInt(70), "Kids");
                if (temp == 2){
                    produkte[999 + i] = new Spielwaren(12 + rnd.nextInt(1510), 0.7 + rnd.nextInt(70), "Freds");
                }
            }else{
                produkte[999 + i] = new Spielwaren(12 + rnd.nextInt(1510), 0.7 + rnd.nextInt(70), "Marvins");
            }
            produkte[1999+ i] = new Haushaltsartikel(1.8 + rnd.nextInt(1499), 0.9 + rnd.nextInt(70), rnd.nextBoolean());
        }

        for (int i = 0; i < 1000; i++) { // in einem Regal kommt [0, 1 oder 2] kommen die produkte [i]
            warenregal[0][i] = new WarenRegal(produkte[i]);
            warenregal[1][i] = new WarenRegal(produkte[i + 999]);
            warenregal[2][i] = new WarenRegal(produkte[i + 1999]);
        }
        gewichtausrechnen(produkte); // Für die ersten drei regale

        regalbefühlen(produkte,warenregal); // Neue Regale befüllen


        

    }

    public static void gewichtausrechnen(Produkt[] produkte){
        double g0 = 0;
        double g1 = 0;
        double g2 = 0;

        for (int i = 0; i < 1000; i++) {
            g0 += produkte[i].gewicht;
            g1 += produkte[i + 999].gewicht;
            g2 += produkte[i + 1999].gewicht;
        }

        System.out.println("Regal 1 " + g0);
        System.out.println("Regal 2 " + g1);
        System.out.println("Regal 3 " + g2);
    }

    public static void regalbefühlen(Produkt[] produkte, WarenRegal[][] warenregal){
        double maxgewicht = 750;
        double g0 = 0;
        double g1 = 0;
        double g2 = 0;
        int i0 = 0;
        int i1= 0;
        int i2= 0;
        Random rnd = new Random();

        while(maxgewicht > g0){ // solange das maximal gewicht nicht überschirrten wurde wird das Regal weiter befüllt.
            int p = rnd.nextInt(1000);
            g0 += produkte[p].gewicht;
            warenregal[3][p] = new WarenRegal(produkte[i0]);
            p ++;
        }
        while(maxgewicht > g1){
            g1 += produkte[i1].gewicht;
            warenregal[4][i1] = new WarenRegal(produkte[i0]);
            i1 ++;

        }
        while(maxgewicht > g2){
            g2 += produkte[i2].gewicht;
            warenregal[5][i2] = new WarenRegal(produkte[i0]);
            i2 ++;
        }

    }

}
