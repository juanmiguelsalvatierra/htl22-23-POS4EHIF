package com.company;
import java.util.*;

public class Haus extends TimerTask {
    private IEvent[] interessenten = new IEvent[20];
    private String[] message ={"L1","L0","LW1","LW0","LS1","LS0","H1","H0","NOTSTOP"};
    private Random rnd;
    private String messagesend;
    private int interssentencount;
    private int count;
    private int countcancel;

    private Timer timer;

    public void addMessage(String message){
        messagesend=message;
    }


    public void addListener(IEvent listener){
        interessenten[interssentencount++]= listener;
    }

    public void hausschedule(){
        timer.schedule(this,0,1000);
    }

    public String getEmail(String code){
        if(code.equals(message)){
            System.out.println("\"Nachricht liegt vor!\"");
            if(code.equals("NOTSTOP")){
                while(countcancel!=rnd.nextInt(60,180)){
                    countcancel++;
                }
                timer.cancel();
            }
        return "test";
        }
        return null;
    }


    @Override
    public void run() {
        hausschedule();
        count++;
        if(count==60){
            getEmail(messagesend);
        }

    }
}
