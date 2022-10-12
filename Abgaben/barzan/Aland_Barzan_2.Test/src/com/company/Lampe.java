package com.company;

abstract public class Lampe implements IEvent {
    private final String bezeichnung;
    private boolean istAn;

    public Lampe(String bezeichnung){
        this.bezeichnung=bezeichnung;
    }

    public void lampeAN(){
        if(istAn){
            istAn=true;
            System.out.println(bezeichnung+"wurde eingeschalten");
        }
        istAn=true;
    }

    public void lampeAus(){
        if(!istAn){
            istAn=false;
            System.out.println(bezeichnung+"wurde ausgschalten");
        }
        istAn=false;
    }



}
