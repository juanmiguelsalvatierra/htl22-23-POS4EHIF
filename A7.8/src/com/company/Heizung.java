package com.company;

public class Heizung implements ITemp{

    private String bezeichnung;
    private boolean eingeschalten = false;
    private int count215 = 0;
    private int count225 = 0;
    private int count60 = 0;
    public Heizung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    // jede Sekunde wird diese Methode aufgerufen und gibt die Temperatur zurück
    @Override
    public void temp(float temp) {
        if (temp <= 21.5){
            count215++;
        }
        if (temp >= 22.5){
            count225++;
        }

        if((count215 >= 10) && (!eingeschalten)){
            eingeschalten = true;
            System.out.println("Die Heizung " + bezeichnung + " wurde eingeschalten");
        }

        if((count225 >= 20) && (eingeschalten)){
            eingeschalten = false;
            System.out.println("Die Heizung " + bezeichnung + " wurde ausgeschalten");
        }
    }
}
