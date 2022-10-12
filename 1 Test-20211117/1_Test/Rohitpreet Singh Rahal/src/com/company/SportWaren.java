package com.company;

import java.util.Random;

public class SportWaren extends Produkt{
    public String hersteller;
    Random rnd = new Random();
    public int vllt;

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        if (rnd.nextInt(3) == 1)
        {
            this.hersteller = "Kids";
        }
        else
        {
            if (rnd.nextInt(3) == 2)
            {
                this.hersteller = "Freds";
            }
            else
            {
                if (rnd.nextInt(3) == 3)
                {
                    this.hersteller = "Marvins";
                }
            }
        }

    }

    @Override
    public String getArt() {
        return super.getArt();
    }

    @Override
    public double getPreis() {
        return super.getPreis();
    }

    @Override
    public double getGewicht() {
        return super.getGewicht();
    }


}
