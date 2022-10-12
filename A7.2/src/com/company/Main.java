package com.company;

import java.util.Timer;

public class Main {

    public static Timer t1 = new Timer();
    public static void main(String[] args) {
	// write your code here
        ZeitAusgabe zeitAusgabe = new ZeitAusgabe();
        t1.schedule(zeitAusgabe, 0, 1000);
    }

    public static void canceltimer(){
        t1.cancel();
    }
}
