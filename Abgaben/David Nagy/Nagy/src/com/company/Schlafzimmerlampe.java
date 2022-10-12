package com.company;

public class Schlafzimmerlampe extends Lampe {

    private String bezeichnung;
    private boolean an;
    public Schlafzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    public void aktionDurchführen(String s) {
        super.aktionDurchführen(s);
        an=getStatus();

        if(s.equals("LW0") && (!an)){
            an=true;
            //System.out.println(bezeichnung+"ist an");
        }
        if(s.equals("LS1") && (!an)){
            an=true;
            //System.out.println(bezeichnung+" ist jetzt an");
        }
        if(s.equals("LS0") && an){
            an=false;
           // System.out.println(bezeichnung+" ist aus");
        }


        if(an=true){
            System.out.println(bezeichnung+ "ist jetz an");
        }else{
            System.out.println(bezeichnung+" ist aus");
        }

    }

}
