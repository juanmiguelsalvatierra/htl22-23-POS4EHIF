package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private Timer timer = new Timer();
    private Random rnd = new Random();
    private String[] codes = {"L1","L0","LW1","LW0","LS1","LS0","H1","H0"};
    private ListenerList list = new ListenerList();
    private String currentCommand;
    private IEmailin iEmailin;
    private int secs = 0, countCodes = 0;

    public void addObjects(){
        list.add(new Schlafzimmerlampe("SleepRoomLamp1")); //habs nochmal geändert zu wenig zeit wusste nicht was sie meinen
        list.add(new Schlafzimmerlampe("SleepRoomLamp2"));
        list.add(new Schlafzimmerlampe("LivingRoomLamp1"));
        list.add(new Schlafzimmerlampe("LivingRoomLamp2"));
        list.add(new Heizkörper("Heizung1"));
        list.add(new Heizkörper("Heizung2"));
    }

    @Override
    public void run() {
        currentCommand = this.getEmail();
        if(secs % 4 == 0){
            if(!currentCommand.equals(null) && !currentCommand.equals("")){
                list.forEachElement(currentCommand);
            }else if(currentCommand.equals("NOTSTOP")){
                this.cancel();
            }
        }
        System.out.println(secs+" Seconds have passed!");
        secs++;
    }

    public String getEmail(){
        if(countCodes == codes.length-1){
            countCodes = 0;
        }
        countCodes++;
        return codes[countCodes];
    }

}
