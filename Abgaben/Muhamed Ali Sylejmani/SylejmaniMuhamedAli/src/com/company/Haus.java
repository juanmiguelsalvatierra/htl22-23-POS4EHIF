package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    IEAktion[] moebel = new IEAktion[20];
    String[] eventCodes = new String[]{"L1", "L0", "LW1", "LW0", "LS1", "LS0", "H1", "H0", "NOTSTOP"};

    Timer t;
    Random rnd = new Random();

    int moebelCounter = 0;
    int eventCodeCounter = 0;

    public void addListener(IEAktion moebel) {
        this.moebel[moebelCounter] = moebel;
        moebelCounter++;
    }

    public void go() {
        t = new Timer();
        t.schedule(this, 4000, 4000);
    }

    @Override
    public void run() {
        if (eventCodes[eventCodeCounter].equals("NOTSTOP")) {
            System.out.println("----------------------------------------");
            System.out.println("Programm vorbei 60 - 180 sekunden warten");
            int warten = rnd.nextInt(60, 181);

            try {
                Thread.sleep(warten * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            t.cancel();

            System.out.println(warten + " sekunden gewartet");
            System.out.println("E N D E");
            return;
        }

        for (int i = 0; i < moebelCounter; i++) {
            moebel[i].aktionAufEmail(eventCodes[eventCodeCounter]);
        }
        if ((eventCodes.length - 1) == eventCodeCounter) {
            eventCodeCounter = 0;
        } else {
            eventCodeCounter++;
        }
    }
}
