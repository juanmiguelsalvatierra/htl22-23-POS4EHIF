package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    IEmail iemail;
    Timer t = new Timer();

    @Override
    public void run() {
        iemail.email(getEmail());
        t.schedule(null , 0 , 1000);
    }

    public String getEmail(){
        return "LS0";
    }
}
