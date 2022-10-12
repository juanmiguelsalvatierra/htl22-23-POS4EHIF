package com.company;

public class Schlafzimmerlampe extends Lampe{
    public Schlafzimmerlampe(String bezeichnung, boolean status) {
        super(bezeichnung, status);
    }

    @Override
    public void aktion(String code) {
        if((code.equals("LS1") || code.equals("LW0")) && (!super.getStatus())){
            System.out.println(super.getBezeichnung() + " schaltet sich ein!");
            super.setStatus(true);
            return;
        }
        else if ((code.equals("H0") || code.equals("LS0")) && (super.getStatus())) {
            System.out.println(super.getBezeichnung() + " schaltet sich aus!");
            super.setStatus(false);
            return;
        }
        super.aktion(code);
    }
}
