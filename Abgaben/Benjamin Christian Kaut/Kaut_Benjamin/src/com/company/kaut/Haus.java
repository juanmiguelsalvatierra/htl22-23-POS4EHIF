package com.company.kaut;

import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {

    Timer t;
    IEvent root = null;

    public void addListener(IEvent e){
        if(root == null){
            root = e;
            return;
        }
        IEvent tmp = root;
        e.setNext(tmp);
        e  = root;
    }

    public Haus(){
        t = new Timer();
    }

    String code;
    public String getEmail(String code){
        this.code = code;
        return code;
    }

    public void go(){
        IEvent tmp = root;

        if(code == "L1"){
            tmp.L1();
            tmp.getNext();
        }
    }

    @Override
    public void run() {
        t.schedule(this, 0, 60000);
    }
}
