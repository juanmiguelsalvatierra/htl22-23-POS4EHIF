package com.company;

public class Schlafzimmerlampe extends Lampe {

    public Schlafzimmerlampe(String bezeichnung, boolean status) {
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
            case "LW0":
                status = true;
                System.out.println(getBezeichnung() + " ist jetzt an; " + "Status: " + status);
                break;
            case "LS1":
                status = true;
                System.out.println(getBezeichnung() + " ist jetzt an; " + "Status: " + status);
                break;
            case "LS0":
                status = false;
                System.out.println(getBezeichnung() + " ist jetzt aus; " + "Status: " + status);
                break;
            case "H0":
                status = false;
                System.out.println(getBezeichnung() + " ist jetzt aus; " + "Status: " + status);
                break;
        }
    }
}
