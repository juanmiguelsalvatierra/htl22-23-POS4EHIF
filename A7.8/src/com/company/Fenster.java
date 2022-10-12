package com.company;

public class Fenster implements ITemp{

    private String bezeichnung;
    private boolean offen = false;
    private int count215 = 0;
    private int count225 = 0;
    private int count60 = 0;

    public Fenster(String bezeichnung){
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
        count60++;

        if(count60 == 60){
            System.out.println("Status " + bezeichnung + " offen " + offen);
            count60 = 0;
        }

        if((count215 >= 10) && (offen)){
            offen = true;
            System.out.println("Das Fenster " + bezeichnung + " wurde geöffnet");
        }

        if((count225 >= 20) && (!offen)){
            offen = false;
            System.out.println("Das Fenster " + bezeichnung + " wurde geschlossen");
        }
    }
}
