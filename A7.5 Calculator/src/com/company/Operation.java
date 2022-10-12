package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Operation implements Runnable {

    private Operation next = null;
    private Timer t = new Timer();
    private IOperation op = null;
    private float erg = 0;

    public Operation(IOperation op){
        this.op = op;
    }

    public void addNext(Operation next){
        this.next = next;
    }

    public void setValue(float val){
        Thread t = new Thread(this);
        t.start();
        erg = op.operation(val);
    }

    @Override
    public void run() {
        t.cancel();
        if(next != null){
            next.setValue(erg);
        }else{
            System.out.println();
        }
    }
}
