package com.company;

public class Lampe implements IEmail{
    private String bezeichnung;
    private boolean an=false;
    IEmail next;

    public Lampe(String bezeichnung){
        this.bezeichnung=bezeichnung;

    }

    @Override
    public void aktionDurchführen(String s) {
        if(s.contentEquals("L1")){
            an=true;
            System.out.println("Alle lampen Sind an");
        }
        if(s.contentEquals("L0")){
            an=false;
            System.out.println("Alle lampen sind aus");
        }
        if(s.equals("H0")){
            an=false;
            System.out.println("Alle lampen sind aus");
        }

    }

    @Override
    public void setNext(IEmail e) {
       next=e;
    }
    public IEmail getNext(){
        return next;
    }

    public boolean getStatus(){
        return an;
    }

}
