package com.company;

public class Wohnzimmerlampe extends Lampe {
    public Wohnzimmerlampe(String bez, boolean status) {
        super(bez, status);
    }

    @Override
    public void Reaktion(String eventcode) {
        if(eventcode.equals("L1") || eventcode.equals("LW1") || eventcode.equals("LS0")){
            setStatus(true);
            System.out.println("Wohnzimmerlampe " + getBez() + " ist jetzt an");
        }
        if (eventcode.equals("LW0") || eventcode.equals("L0") || eventcode.equals("H0")){
            setStatus(false);
            System.out.println("Wohnzimmerlampe " +  getBez() + " ist jetzt aus");
        }
    }
}
