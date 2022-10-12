package com.company;

import java.util.Random;
public class Haushaltsartikel extends Produkt{
    public static Random rnd = new Random();
    public boolean bio;
    public Haushaltsartikel() {
        String txt = "";
        txt += rnd.nextInt(70) + rnd.nextFloat() + 0.9f;
        preis = rnd.nextInt(1500) + 1.8f;
        gewicht = Float.parseFloat(txt);
        int auswahl = rnd.nextInt(2);
        if(auswahl == 0) {
            bio = true;
        }
        else {
            bio = false;
        }
  }
}
