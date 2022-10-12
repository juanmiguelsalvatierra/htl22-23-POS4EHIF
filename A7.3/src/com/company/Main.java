package com.company;

import java.util.Timer;

public class Main {

    public static Timer t1 = new Timer();
    public static void main(String[] args) {
	// write your code here
        GameControl gc = new GameControl();
        t1.schedule(gc, 0, 10000);
    }
}
