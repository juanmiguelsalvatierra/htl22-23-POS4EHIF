package com.company;

public class Schlafzimmerlampe extends Lampe{

    private Wohnzimmerlampe wohnzimmerlampe;
    private boolean istAN;
    public Schlafzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    public void schlafzimmeraus(){
        istAN=false;
    }
    public void schlafzimmeran(){
        istAN=true;
    }

    @Override
    public void sendCode(String code) {
        switch(code){
            case "L1":
                super.lampeAN();
            case "L0":
                super.lampeAus();
            case "LS1":
                System.out.println("Schlafzimmerlampen wurden eingeschalten");
                schlafzimmeran();
            case "LS0":
                System.out.println("Schlafzimmerlampen wurden ausgeschalten & Wohnzimmerlampen wurden eingeschalten");
                schlafzimmeraus();
                wohnzimmerlampe.wohnzimmeran();

            default:
                System.out.println("Nothing happened in Schlafzimmer");
        }
    }
}
