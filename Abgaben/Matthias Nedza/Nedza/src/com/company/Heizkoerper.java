package com.company;

public class Heizkoerper implements IEvent {
    private String bezeichnung;
    private boolean status;

    public Heizkoerper(String bezeichnung, boolean status) {
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    public void aktion() {
        String nachricht = ""; //Emailbefehl

        switch (nachricht) {
            case "H1":
                status = true;
                System.out.println(bezeichnung + " gibt Wärme ab; " + "Status: " + status);
                break;
            case "H0":
                status = false;
                System.out.println(bezeichnung + " gibt keine Wärme ab; " + "Status: " + status);
                break;
        }
    }
}
