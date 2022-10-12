package com.company;

import java.util.TimerTask;

public class ZeitAusgabe extends TimerTask {
    public int count = 0;
    @Override
    public void run() {

        System.out.println(++count);
        /*if(count >= 5){
            Main.canceltimer();
        }*/
    }
}
