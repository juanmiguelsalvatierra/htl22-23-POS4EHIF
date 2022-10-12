package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
	    Timer t = new Timer();

        Haus h = new Haus();

        h.add(new Wohnzimmerlampe("Wohnzimmerlampe1"));
        h.add(new Wohnzimmerlampe("Wohnzimmerlampe2"));
        h.add(new Schlafzimmerlampe("Schlafzimmerlampe1"));
        h.add(new Schlafzimmerlampe("Schlafzimmerlampe2"));
        h.add(new Heizkörper("Heizkörper1"));
        h.add(new Heizkörper("Heizkörper2"));

        t.schedule(h, 0, 1000);

    }
}
