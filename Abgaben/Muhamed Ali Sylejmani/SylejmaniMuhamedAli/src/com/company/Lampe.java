package com.company;


public abstract class Lampe implements IEAktion{
    protected boolean status;
    protected String bezeichnung;
    protected final String[] eventCodeAn;
    protected final String[] eventCodeAus;

    public Lampe(boolean status, String bezeichnung, String[] eventCodeAn, String[] eventCodeAus) {
        this.status = status;
        this.bezeichnung = bezeichnung;
        this.eventCodeAn = eventCodeAn;
        this.eventCodeAus = eventCodeAus;
    }
}
