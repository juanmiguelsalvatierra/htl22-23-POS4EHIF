package com.company;

public class Wohnzimmerlampe extends Lampe {

    public Wohnzimmerlampe(String bezeichnung, boolean status) {
        super(bezeichnung, status);
    }

    @Override
    public void aktion() {
        String nachricht = ""; //Emailbefehl
        boolean status = getStatus();

        switch (nachricht) {
            case "L1":
                status = true;
                System.out.println(getBezeichnung() + " ist jetzt an; " + "Status: " + status);
                break;
            case "L0":
                status = false;
                System.out.println(getBezeichnung() + " ist jetzt aus; " + "Status: " + status);
                break;
            case "LW1":
                status = true;
                System.out.println(getBezeichnung() + " ist jetzt an; " + "Status: " + status);
                break;
            case "LW0":
                status = false;
                System.out.println(getBezeichnung() + " ist jetzt aus; " + "Status: " + status);
                break;
            case "LS0":
                status = true;
                System.out.println(getBezeichnung() + " ist jetzt an; " + "Status: " + status);
                break;
            case "H0":
                status = false;
                System.out.println(getBezeichnung() + " ist jetzt aus; " + "Status: " + status);
                break;
        }
    }
}
