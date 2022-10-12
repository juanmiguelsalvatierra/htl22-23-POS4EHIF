package com.company;

public class Lampe implements IEvent{
    private String bezeichnung;
    private boolean status;

    public Lampe(String bezeichnung, boolean status){
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    public boolean getStatus(){return status;}
    public String getBezeichnung(){return bezeichnung;}

    public void setStatus(boolean a){status = a;}

    @Override
    public void aktion(String code) {
        if(code.equals("L1") && (!status)){
            System.out.println(bezeichnung + " schaltet sich ein!");
            status = true;
        }
        else if ((code.equals("H0") || code.equals("L0")) && (status)) {
            System.out.println(bezeichnung + " schaltet sich aus!");
            status = false;
        }
    }
}
