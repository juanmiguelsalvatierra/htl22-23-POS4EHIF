package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Zentrale extends TimerTask implements IBauteilFertig {

    private int[] fertigeBauteile = new int[5];
    private Timer t;
    public Zentrale(){
        Arbeitsstation a2 = new Arbeitsstation(5,3, null, this, new int[]{0,0,3,0,2});
        Arbeitsstation a1 = new Arbeitsstation(4,3, a2, this, new int[]{4,2,0,0,0});
        Maschine m1 = new Maschine(1,1, a1,this);
        Maschine m2 = new Maschine(2,4, a1,this);
        Maschine m3 = new Maschine(3,2, a2,this);
        m1.go();
        m2.go();
        m3.go();
        a1.go();
        a2.go();
        t = new Timer();
        t.schedule(this, 0, 10000);
    }

    @Override
    public void run() {
        //Ausgabe aller produzierten Bauteile
        for(int i = 0; i < fertigeBauteile.length; i++){
            System.out.println("-------------------");
            System.out.println("FERTIGE BAUTEILE");
            fertigeBauteile[0] -= (fertigeBauteile[3] * fertigeBauteile[0]*4);
        }
        for(int i = 0; i < fertigeBauteile.length; i++){
            System.out.println("Bauteil " + (i + 1) + " --> " + fertigeBauteile[i] + " Stück");
        }
        System.out.println("---------------------");
    }

    @Override
    public void bauteilFertig(int bauteil) {
        System.out.println("Bauteil " + bauteil + " ist fertig");
    }
}
