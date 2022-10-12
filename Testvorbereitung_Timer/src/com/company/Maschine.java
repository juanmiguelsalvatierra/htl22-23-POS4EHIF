package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Maschine extends TimerTask {
    private int bauteilID;
    private int dauer;
    private IBauteilFertig arbeitsstation, zentrale;
    private Timer t;

    public Maschine(int bauteilID, int dauer, IBauteilFertig arbeitsstation, IBauteilFertig zentrale){
        this.bauteilID = bauteilID;
        this.dauer = dauer;
        this.arbeitsstation = arbeitsstation;
        this.zentrale = zentrale;
        t = new Timer();
    }

    public void go(){
        t.schedule(this, 0,dauer*1000);
    }
    @Override
    public void run() {
        //Event auslösen --> Bauteil fertig
        if(zentrale != null){
            zentrale.bauteilFertig(bauteilID);
        }
        if (arbeitsstation != null) {
            arbeitsstation.bauteilFertig(bauteilID);
        }
    }
}
