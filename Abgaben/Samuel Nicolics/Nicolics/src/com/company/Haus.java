package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private IEvent[] liste = new IEvent[20];
    private int listIndex = 0;
    private Random rnd = new Random();
    private int countStop = 0, countMax;
    private boolean count = false;

    public void start(){
        addListener(new Wohnzimmerlampe("Wohnzimmerlampe 1", false));
        addListener(new Wohnzimmerlampe("Wohnzimmerlampe 2", false));
        addListener(new Schlafzimmerlampe("Schlafzimmerlampe 1", false));
        addListener(new Schlafzimmerlampe("Schlafzimmerlampe 2", false));
        addListener(new Heizkörper("Heizkörper 1", false));
        addListener(new Heizkörper("Heizkörper 2", false));

        Timer timerMail = new Timer();
        timerMail.schedule(this, 0, 60000);
    }

    @Override
    public void run() {
        String code = getEmail();
        if(code == "NOTSTOP"){
            count = true;
            countMax = rnd.nextInt(180);
        }
        if(count = true){
            if(countStop > countMax){
                this.cancel();
            }
            countStop++;
        }
        for (int i = 0; i < listIndex; i++) {
            liste[i].Event(getEmail());
        }
    }

    public String getEmail(){
        return "LW1";
    }

    public void addListener(IEvent obj){
        liste[listIndex] = obj;
        listIndex++;
    }
}
