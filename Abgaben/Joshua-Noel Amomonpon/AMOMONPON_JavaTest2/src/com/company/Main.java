package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Haus haus = new Haus();
        haus.addListener(new Wohnzimmerlampe("Wohnzimmerlampe1"));
        haus.addListener(new Wohnzimmerlampe("Wohnzimmerlampe2"));
        haus.addListener(new Schlafzimmerlampe("Schlafzimmerlampe1"));
        haus.addListener(new Schlafzimmerlampe("Schlafzimmerlampe2"));
        haus.addListener(new Heizkörper("Heizkörper1"));
        haus.addListener(new Heizkörper("Heizkörper2"));

        Timer t = new Timer();
        t.schedule(haus,0,1000);

    }
}
