package com.company;
import java.util.Timer;

public class Main {

    public static Timer t1 = new Timer();
    public static Timer t2 = new Timer(true);
    public static void main(String[] args) {
	// write your code here
        ZeitAusgabe zeitAusgabe = new ZeitAusgabe();
        Stop stop = new Stop(t1);
        t1.schedule(zeitAusgabe, 0, 1000);
        t2.schedule(stop,5000);
        System.out.println("Fertig");
    }
}
