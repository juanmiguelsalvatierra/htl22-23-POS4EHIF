package com.company;

import java.util.Date;
import java.util.TimerTask;

public class ZeitAusgabe extends TimerTask {
    @Override
    public void run() {
        System.out.println(new Date());
    }
}
