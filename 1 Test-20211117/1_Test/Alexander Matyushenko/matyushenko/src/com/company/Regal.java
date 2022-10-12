package com.company;

public class Regal {
    String bezeichnung;
    public Double gewicht;
    public boolean stellplatz;
    public Regal(String bezeichnung){
        this.bezeichnung = bezeichnung;
        this.gewicht =  0.0;
        this.stellplatz = true;
    }

    Produkt root = null;

    //Einfügen in Liste
    public void add(Produkt a){
        if (root == null){
            root = a;
            return;
        }
        a= root.next;
        root = a;
    }
    //Entfernen
    public Produkt removeAndInsert(int id){
        if(root == null){
            System.out.println("Keine Produkte vorhanden!");
            return null;
        }
        if(root.next == null){
            root = null;
        }
        Produkt temp = root;
        Produkt ware = null;
        while(temp.next != null){
            if(id == temp.next.id){
                ware = temp;
                temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        //Preis ändern in neunen Regal
        ware.preis = ware.preis *0.9;
        //Gewicht des Regals erhöhen
        gewicht+=ware.gewicht;

        return ware;
    }
    //Ausgabe
    public void ausgeben(){
        Produkt temp = root;
        Double preisGesm = 0.0;
        //!NICHT ERWEITERBAR! Stelle 0 Ewaren, Stelle 2 Spielwaren, Stelle 3 Haushalt
        int [] anz = new int[3];

        while(temp != null){
            if(temp instanceof Elektroware){
                anz[0]++;
            }
            if(temp instanceof Spielware){
                anz[1]++;
            }
            if(temp instanceof Haushaltsartikel){
                anz[2]++;
            }
            preisGesm += temp.preis;
            temp = temp.next;
        }
        //Um das erweiterbar zumachen, kann man eine for schleife verwenden for(int i = 0; i<anz.lenght; i++)
        //Ich habe das so gemacht damit ich keine abfragen machen muss;
        System.out.println("Anzahl Elktrowaren: "+anz[0]);
        System.out.println("Anzahl Spielwaren: "+anz[1]);
        System.out.println(("Anzahl Haushaltsartikel: "+anz[2]));

        System.out.println("Preis des Regals: "+preisGesm);
    }


    //SetTrue
    public boolean voll(){
        return false;
    }

    //Check if empty
    public void checkIfEmpty(){
        if(root == null){
            stellplatz= true;
        }
    }
}
