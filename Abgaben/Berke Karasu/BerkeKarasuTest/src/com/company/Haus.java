package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private IEvent head=null;
    private Timer t = new Timer();
    private Exit e = new Exit(t);
    private int count=0;
    private String[] codes = new String[]{"L1", "L0", "LW1", "LW0", "LS1", "LS0", "H1", "H0"};

    public void add(IEvent o) {
        if (head==null) {
            head=o;
            return;
        }
        o.setNext(head);
        head=o;
    }

    public String getEmail() {
        return codes[count];
    }

    @Override
    public void run() {
        String code = getEmail();
        if (code != null) {

            if (code.equals("NOTSTOP")) {
                Random rn = new Random();
                int warten = rn.nextInt(120)+60;
                System.out.println("abbrechen");
                try {
                    Thread.sleep(warten*1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            IEvent temp = head;
            while (temp != null) {
                temp.neueEmail(code);
                temp = temp.getNext();
            }

            if (count > codes.length - 2) count = 0;
            else count++;

        }
        else {
            System.out.println("keine Email empfangen");
        }
    }
}
