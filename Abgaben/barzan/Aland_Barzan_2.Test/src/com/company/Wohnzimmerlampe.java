package com.company;

public class Wohnzimmerlampe extends Lampe{

    private boolean wohnzimmer;
    private Schlafzimmerlampe schlafzimmerlampe;
    public Wohnzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }
    public void wohnzimmeran(){
        wohnzimmer=true;
    }

    @Override
    public void sendCode(String code) {
        switch(code){
            case "L1":
                super.lampeAN();
            case "L0":
                super.lampeAus();
            case "LW1":
                if(wohnzimmer){
                    wohnzimmer=true;
                    System.out.println("Wohnzimmerlampen wurde eingeschalten");
                }
                wohnzimmer=true;
            case "LW0":
                if(!wohnzimmer){
                    wohnzimmer=false;
                    System.out.println("Wohnzimmerlampen wurden ausgeschalten &  Schlafzimmerlampen wurden eingschalten");
                }
                wohnzimmer=false;
                schlafzimmerlampe.schlafzimmeran();

            default:
                System.out.println("Nothing happened in Wohnzimmer");
        }


    }
}
