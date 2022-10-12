package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Arbeitsstation extends TimerTask implements IBauteilFertig{

    private int bauteilID;
    private int dauer;
    private IBauteilFertig arbeitsstation, zentrale;
    private Timer t;
    private int produktionsfortschritt;
    private boolean produktionGestartet = false;
    private int[] bauteillager = new int[5];
    private int[] notwendigeBauteile = new int[5];

    public Arbeitsstation(int bauteilID, int dauer, IBauteilFertig arbeitsstation, IBauteilFertig zentrale, int[] notwendigeBauteile){
        this.bauteilID = bauteilID;
        this.dauer = dauer;
        this.arbeitsstation = arbeitsstation;
        this.zentrale = zentrale;
        this.notwendigeBauteile = notwendigeBauteile;
        t = new Timer();
    }

    public void go(){
        t.schedule(this, 0, dauer * 1000);
    }
    @Override
    public void run() {
        //Erst produzieren, wenn genug Bauteile am Lager sind
        if (!produktionGestartet){
            boolean go = true;
            for (int i = 0; i < bauteillager.length; i++){
                if(bauteillager[i] < notwendigeBauteile[i]){
                    go = false;
                    break;
                }
            }
            if(go) {
                for (int i = 0; i < bauteillager.length; i++) {
                    bauteillager[i] -= notwendigeBauteile[i];
                }
                produktionGestartet = true;
            }
        } else {
            produktionsfortschritt++;

            if(produktionsfortschritt == dauer){
                //Interessenten informieren
                if(arbeitsstation != null){arbeitsstation.bauteilFertig(bauteilID);}
                if(zentrale != null) {zentrale.bauteilFertig(bauteilID);}
                //Reset des Produktionsvorgangs
                produktionsfortschritt = 0;
                produktionGestartet = false;
            }
        }

        //Produktionsdauer beachten

    }

    @Override
    public void bauteilFertig(int bauteil) {
        bauteillager[bauteil-1]++;
    }
}
