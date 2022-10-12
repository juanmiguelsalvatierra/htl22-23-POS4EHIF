package com.company;

import java.util.Random;

public class HaushaltsWaren extends Produkt{
    public boolean bio;
    Random rd = new Random();
    public boolean chance;
    //public HaushaltsWaren(boolean bio)
    //{
    //        this.bio = bio;
    //}

    public boolean isBio()
    {
        if (chance = rd.nextInt(100) > 50)
        {
            return bio = true;
        }
        else
        {
            if (chance = rd.nextInt(100) < 50)
            {
                return bio = false;
            }
        }
        return bio;
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
