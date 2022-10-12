package com.company;

import java.util.Random;

public class Spielware extends Produkt{
    public static Random rnd = new Random();
    public String hersteller;
    public Spielware() {
        String txt = "";
        txt += (rnd.nextInt(70) + rnd.nextFloat()+ 0.7f);
        preis = rnd.nextInt(1499) + 12;
        gewicht = Float.parseFloat(txt);
        int auswahl = rnd.nextInt(4) + 1;
        switch(auswahl) {
            case 1:
                hersteller = "kids";
                break;
            case 2:
                hersteller = "Freds";
                break;
            case 3:
                hersteller = "Marvins";
                break;
        }
    }
}
