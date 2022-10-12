package com.company;

public class Schlafzimmerlampe extends Lampe{

    public Schlafzimmerlampe(String bezeichnung, boolean status) {
        super(bezeichnung, status);
    }

    @Override
    public void Event(String EventCode){
        super.Event(EventCode);

        switch(EventCode){
            case "LW0":
            case "LS1":
                super.setStatus(true);
                System.out.println(super.getBezeichnung() + " wurde eingeschalten");
                break;
            case "LS0":
                super.setStatus(false);
                System.out.println(super.getBezeichnung() + " wurde ausgeschalten");
                break;
            default:
                break;
        }
    }
}
