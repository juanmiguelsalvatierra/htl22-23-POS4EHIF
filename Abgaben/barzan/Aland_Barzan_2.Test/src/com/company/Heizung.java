package com.company;

public class Heizung implements IEvent{
    private String bezeichnung;
    private boolean istAN;
    private Lampe lampe;
    public Heizung(String bezeichnung){
        this.bezeichnung=bezeichnung;

    }

    @Override
    public void sendCode(String code) {
        switch(code){
            case "H1":
                if(istAN){
                    istAN=true;
                    System.out.println(bezeichnung+"wurde eingeschalten");
                }
                istAN=true;
            case "H0":
                if(!istAN){
                    istAN=false;
                    System.out.println(bezeichnung +" wurde ausgeschalten");
                }
                istAN=false;
                lampe.lampeAus();
            default:
                System.out.println("Nothing happened in "+ bezeichnung);
            }
        }
    }


