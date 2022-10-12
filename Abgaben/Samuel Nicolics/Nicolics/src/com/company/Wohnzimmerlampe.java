package com.company;

public class Wohnzimmerlampe extends Lampe{

    public Wohnzimmerlampe(String bezeichnung, boolean status) {
        super(bezeichnung, status);
    }

    @Override
    public void Event(String EventCode){
        super.Event(EventCode);

        switch(EventCode){
            case "LW1":
            case "LS0":
                super.setStatus(true);
                System.out.println(super.getBezeichnung() + " wurde eingeschalten");
                break;
            case "LW0":
                super.setStatus(false);
                System.out.println(super.getBezeichnung() + " wurde ausgeschalten");
                break;
            default:
                break;
        }
    }
}
