package com.company;

import java.util.Random;

public class Elektroware extends Produkt{
    public static Random rnd = new Random();
    public float watt;
    public Elektroware() {
        String txt = "";
        txt += rnd.nextInt(70) + rnd.nextFloat();
        preis = rnd.nextInt(1500) + 1;
        gewicht = Float.parseFloat(txt);
        watt = rnd.nextInt(2500) + 0.3f;
    }

}
