package com.company;

import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static Timer t = new Timer();
    public static void main(String[] args) {
	// write your code here
        ZeitAusgabe zeitAusgabe = new ZeitAusgabe();
        System.out.println("Wann soll der Wecker läuten?");
        Scanner sec = new Scanner(System.in);
        int secint = 0;
        try{
            secint =   sec.nextInt() * 1000;
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Falsche Eingabe");
            System.exit(1000);
        }
        t.schedule(zeitAusgabe,secint);
    }

    public static void stop(){
        t.cancel();
    }
}
