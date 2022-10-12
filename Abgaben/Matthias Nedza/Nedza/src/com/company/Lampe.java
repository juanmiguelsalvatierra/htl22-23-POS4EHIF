package com.company;

public abstract class Lampe implements IEvent {
    private String bezeichnung;
    private boolean status;

    public Lampe(String bezeichnung, boolean status) {
        this.bezeichnung = bezeichnung;
        this.status = status;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public boolean getStatus() {
        return status;
    }
}
