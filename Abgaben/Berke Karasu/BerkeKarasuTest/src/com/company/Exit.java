package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Exit extends TimerTask {
    Timer t = new Timer();

    public Exit(Timer t) {
        this.t=t;
    }

    @Override
    public void run() {
        System.exit(0);
    }
}
