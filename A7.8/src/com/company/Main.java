package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Haus haus = new Haus();
        haus.addListener(new Fenster("Fenster 1"));
        haus.addListener(new Fenster("Fenster 2"));
        haus.addListener(new Fenster("Fenster 3"));
        haus.addListener(new Fenster("Fenster 4"));
        haus.addListener(new Heizung("Heizung 1"));

        Timer t = new Timer(false);
        t.schedule(haus, 0, 1000);
    }
}
