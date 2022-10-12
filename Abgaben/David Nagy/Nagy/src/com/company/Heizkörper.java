package com.company;

public class Heizkörper implements IEmail{

    private String bezeichnung;
    private boolean an=false;
    IEmail next;

    public Heizkörper(String bezeichnung){
        this.bezeichnung=bezeichnung;
    }

    @Override
    public void aktionDurchführen(String s) {

        if(s.equals("H1")){
            System.out.println("Alle heizkörper sind an");
            an=true;
        }
        if(s.equals("H0")){
            System.out.println("Heizkörper sind aus");
            an=false;
        }
    }
    public void setNext(IEmail e) {
        next=e;
    }
    public IEmail getNext(){
        return next;
    }

}
