package com.company;

public abstract class Lampe implements IEvent{
    private String bezeichnung;
    private boolean status;

    public Lampe(String bezeichnung, boolean status) {
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    @Override
    public void Event(String EventCode){
        switch(EventCode){
            case "L1":
                status = true;
                System.out.println(bezeichnung + " wurde eingeschalten");
                break;
            case "L0":
            case "H0":
                status = false;
                System.out.println(bezeichnung + " wurde ausgeschalten");
                break;
            default:
                break;
        }
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getBezeichnung(){
        return bezeichnung;
    }
}
