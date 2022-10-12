package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask implements Runnable {
    private String name;
    private Random rnd = new Random();
    private int count = 0;
    private int countArray = 0;
    private IEvent[] geräte = new IEvent[20];
    private Timer t;
    Thread thread;

    public Haus(String name){
        this.name = name;
        t = new Timer();
        thread = new Thread();
    }

    public void go(){t.schedule(this,0,4000);}

    public void add(IEvent a){
        if(countArray == geräte.length) return;
        geräte[countArray] = a;
        countArray++;
    }

    @Override
    public void run() {
        String code = getEmail();
        if(code.equals("NOTSTOP")){
            t.schedule(new Warten(), 0,(rnd.nextInt(181)+60)*1000);
            t.cancel();
            return;
        }
        for (int i = 0; i < countArray; i++) {
            geräte[i].aktion(code);
        }
    }

    public String getEmail(){
        String[] code = {"L1", "L0", "LW1", "LW0", "LS1", "LS0", "H1", "H0", "NOTSTOP"};
        if(count == code.length) count = 0;
        count++;
        return code[count-1];
    }
}
