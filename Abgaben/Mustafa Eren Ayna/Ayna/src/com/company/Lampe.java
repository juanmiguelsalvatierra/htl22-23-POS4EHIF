package com.company;

public class Lampe{
    private String bezeichnung;
    private boolean eingeschalten;

    public Lampe(String bezeichnung, boolean eingeschalten){
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }


    public boolean isEingeschalten() {
        return eingeschalten;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
