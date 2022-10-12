package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        int howManySec = 1;
        Haus haus = new Haus();
        Timer tmr = new Timer(false);

        haus.addObjects();

        tmr.schedule(haus, 0, howManySec * 1000);


    }
}
