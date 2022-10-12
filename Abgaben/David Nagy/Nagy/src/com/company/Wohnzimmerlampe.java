package com.company;

public class Wohnzimmerlampe extends Lampe {

    private String bezeichnung;
    private boolean an;
    public Wohnzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public void aktionDurchführen(String s) {
        super.aktionDurchführen(s);
        an=getStatus();

        if(s.equals("LW1") && (!an)){//Überprüfen ob die Lampen an sind, wenn nicht wird die Lampe eingeschaltet
            an=true;
        }
        if(s.equals("LW0") && (an)){//Überprüfen ob die Lampen an sind, wenn ja wird die Lampe ausgeschaltet
            an=false;
        }
        if(s.equals("LS0") && (!an)){
            an=true;
        }
        if(an){
            System.out.println(bezeichnung+" ist jetzt an");
        }else{
            System.out.println(bezeichnung+ "ist aus");
        }

    }

}
