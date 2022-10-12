package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {

    public IEvent[] geraete = new IEvent[20];
    public int counter = 0;

    public Haus() {
        // Objekte anlegen
        Lampe w1 = new Wohnzimmerlampe("Wohnzimmerlampe 1", false);
        Lampe w2 = new Wohnzimmerlampe("Wohnzimmerlampe 2", false);

        Lampe s1 = new Schlafzimmerlampe("Schlafzimmerlampe 1", false);
        Lampe s2 = new Schlafzimmerlampe("Schlafzimmerlampe 2", false);

        Heizkoerper h1 = new Heizkoerper("Heizkörper 1", false);
        Heizkoerper h2 = new Heizkoerper("Heizkörper 2", false);

        geraete[0] = w1;
        geraete[1] = w2;
        geraete[2] = s1;
        geraete[3] = s2;
        geraete[4] = h1;
        geraete[5] = h2;
    }

    public void addListener() {

    }

    public String getEmail() {
        return "code";
    }

    @Override
    public void run() {
        String nachricht = getEmail();

        if (nachricht != "") {
            for (int i = 0; i < geraete.length; i++) {
                geraete[i].aktion();
            }
        } else {
            System.out.println("Es liegt keine Nachricht vor");
        }
    }
}
