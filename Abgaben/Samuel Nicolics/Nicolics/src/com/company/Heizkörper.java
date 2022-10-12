package com.company;

public class Heizkörper implements IEvent{
    public String bezeichnung;
    private boolean status;

    public Heizkörper(String bezeichnung, boolean status){
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    @Override
    public void Event(String EventCode){
        switch(EventCode){
            case "H1":
                status = true;
                System.out.println(bezeichnung + " wurde eingeschalten");
                break;
            case "H0":
                status = false;
                System.out.println(bezeichnung + " wurde ausgeschalten");
                break;
            default:
                break;
        }
    }
}
