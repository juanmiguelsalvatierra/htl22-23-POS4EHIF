package com.company;

import java.util.Random;

public class ElektroWaren extends Produkt{
    public int watt;
    Random random = new Random();

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = random.nextInt(2500);
    }

    @Override
    public String getArt() {
        return super.getArt();
    }

    @Override
    public double getPreis() {
        return super.getPreis() * 0.90;
    }

    @Override
    public double getGewicht() {
        return super.getGewicht();
    }
}
