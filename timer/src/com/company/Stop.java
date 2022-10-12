package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Stop extends TimerTask {

    private Timer t = null;
    public Stop(Timer timer1){
        t = timer1;
    }
    @Override
    public void run() {
        t.cancel();
    }
}
