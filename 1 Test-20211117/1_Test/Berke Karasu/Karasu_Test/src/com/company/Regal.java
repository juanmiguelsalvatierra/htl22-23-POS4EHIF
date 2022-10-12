package com.company;

public class Regal {
    public int maxTraglast = 21000;
    public double gewicht = 0;
    public int nr;

    public Regal(int nr){
        this.nr = nr;
    }

    public Ware head;

    public void add(Ware w){
        if (head == null){
            head = w;
            return;
        }
        w.next = head;
        head = w;
    }

    public void anzahlAusgabe(){
        if (head == null){
            System.out.println("Nichts im Regal");
        }else {
            Ware tmp = head;
            int anzE = 0, anzS = 0, anzH = 0;
            while (tmp != null){
                if (tmp instanceof Elektroware){
                    anzE++;
                }else if (tmp instanceof Spielware){
                    anzS++;
                }else {
                    anzH++;
                }
                tmp = tmp.next;
            }
            System.out.println("Anzahl Elektrowaren: " + anzE);
            System.out.println("Anzahl Spielwaren: " + anzS);
            System.out.println("Anzahl Haushaltsartikel: " + anzH);
        }
    }

    public void gesamtPreisAusgabe() {
        if (head == null) {
            System.out.println("Regal leer, deshalb kein Preis");
        } else {
            Ware tmp = head;
            double gesamtPreis = 0;
            while (tmp != null) {
                gesamtPreis += tmp.preis;
                tmp = tmp.next;
            }
            System.out.println("Gesamtpreis vom Regal: " + gesamtPreis);
        }
    }


}
