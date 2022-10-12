package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Timer t = new Timer();
        Haus haus = new Haus();

        t.schedule(haus, 60000, 60000);
    }
}
