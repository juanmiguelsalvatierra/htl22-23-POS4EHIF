package com.company;

public class Schlafzimmerlampe extends Lampe {
    public Schlafzimmerlampe(String bez, boolean status) {
        super(bez, status);
    }

    @Override
    public void Reaktion(String eventcode) {
        if(eventcode.equals("L1") || eventcode.equals("LW0") || eventcode.equals("LS1")){
            setStatus(true);
            System.out.println("Schlafzimmerlampe " + getBez() + " ist jetzt an");
        }
        if (eventcode.equals("LS0") || eventcode.equals("H0") || eventcode.equals("L0")){
            setStatus(false);
            System.out.println("Schlafzimmerlampe " +  getBez() + " ist jetzt aus");
        }
        /*if (eventcode.equals("NOTSTOP")){
            Haus.TCancel();
        }*/
    }
}
