package com.company;

public class Heizkörper implements IEvent{
    private String bezeichnung;
    private boolean status;

    public Heizkörper(String bezeichnung, boolean status){
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    @Override
    public void aktion(String code) {
        if(code.equals("H1") && (!status)){
            System.out.println(bezeichnung + " schaltet sich ein!");
            status = true;
        }
        else if (code.equals("H0") && (status)) {
            System.out.println(bezeichnung + " schaltet sich aus!");
            status = false;
        }
    }
}
