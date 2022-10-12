package com.company;

public class Wohnzimmerlapme extends Lampe implements IEmail{

    public Wohnzimmerlapme(String bezeichnung, boolean eingeschalten) {
        super(bezeichnung, eingeschalten);
    }


    @Override
    public void email(String email) {
        if (email.equals("L1")){
            boolean eingeschalten = isEingeschalten();
            eingeschalten = true;
            System.out.println("Alle Lampen wurden eingeschaltet : " + getBezeichnung());
        }
        if (email.equals("L0")){
            boolean eingeschalten = isEingeschalten();
            eingeschalten = false;
            System.out.println("Alle Lampen wurden ausgeschaltet : " + getBezeichnung());
        }
        else{
            if (email.equals("LW1")){
                boolean eingeschalten = isEingeschalten();
                eingeschalten = true;
                System.out.println("Alle Lampen im Wohnzimmer wurden eingeschaltet : " + getBezeichnung());
            }else{
                if(email.equals("LW0")){
                    boolean eingeschalten = isEingeschalten();
                    eingeschalten = false;
                    System.out.println("Alle Lampen im Wohnzimmer wurden ausgeschaltet : " + getBezeichnung());
                }else{
                    if (email.equals("LS0")){
                        boolean eingeschalten = isEingeschalten();
                        eingeschalten = true;
                        System.out.println("Alle Lampen im Wohnzimmer wurden eingeschaltet : " + getBezeichnung());
                    }else{
                        if(email.equals("H0")){
                            boolean eingeschalten = isEingeschalten();
                            eingeschalten = false;
                            System.out.println("Alle Lampen wurden ausgeschalten : " + getBezeichnung());
                        }else{
                            System.out.println("Keine Aktion konnte durchgeführt werden : " + getBezeichnung());
                        }
                    }
                }
            }
        }
    }
}
