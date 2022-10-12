package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    private Interface[] Iliste = new Interface[20];
    private Timer t = new Timer();
    private int Icount = 0;
    private String[] commands = new String[]{"L1", "L0", "LW1", "LW0", "LS1", "LS0", "H1", "H0"};
    private int commandcount = -1;

    public Haus(){
        addListener(new Wohnzimmerlampe("LW1", false));
        addListener(new Wohnzimmerlampe("LW2", false));

        addListener(new Schlafzimmerlampe("LS1", false));
        addListener(new Schlafzimmerlampe("LS2", false));

        addListener(new Heizkörper("H1", false));
        addListener(new Heizkörper("H2", false));

        //t.schedule(this, 0, 60000); Aufgabe Nummer 2
        t.schedule(this, 0, 4000); //Aufgabe Nummer 5

    }
    @Override
    public void run() {
        String eventcode = getEmail();
        for (int i = 0; i < 20; i++){
            if(Iliste[i] == null){
                break;
            }
            Iliste[i].Reaktion(eventcode);
        }
    }

    public void addListener(Interface i){
        Iliste[Icount] = i;
        Icount++;
    }

    public String getEmail(){
        if(commandcount == 7){
            commandcount = -1;
        }
        commandcount++;
        return commands[commandcount];
    }

    public void TCancel(){
        t.cancel();
    }
}
