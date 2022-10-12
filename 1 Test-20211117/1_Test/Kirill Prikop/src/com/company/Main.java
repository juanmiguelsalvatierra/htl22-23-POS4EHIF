package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Aufgabe 3.1
        Random rnd= new Random();
        Produkt[][] warenlager= new Produkt[1000][3]; //->1000
        int randomZahl;
        String rndHersteller;
        boolean rndBio=false;

        for(int i=0;i>1000;i++){
            warenlager[i][0]= new Elektrowaren("Elektrowaren",rnd.nextDouble(2,1500),rnd.nextDouble(0.5,70),rnd.nextDouble(0.3,2500)); // hab schwierigkeiten mit random
            randomZahl= rnd.nextInt(3);
            if(randomZahl==1){
                rndHersteller="Kids";
            }
            else{
                if(randomZahl==2){
                    rndHersteller= "Freds";
                }
                else{
                    rndHersteller= "Marvins";
                }
            }
            warenlager[i][1]= new Spielwaren("Spielwaren",rnd.nextDouble(12,1510),rnd.nextDouble(0.7,70.2), rndHersteller);
            randomZahl= rnd.nextInt(2);
            if(randomZahl==1){
                rndBio= true;
            }
            warenlager[i][2]= new Haushaltsartikel("Haushaltsartikel",rnd.nextDouble(1.8,1499.8),rnd.nextDouble(0.9,70.4),rndBio);
        }

        //Aufgabe 3.2
        List<Produkt> regal1= new <Produkt>List();  //liste geht nicht
        double derZeitTraglast =0;
        int anzE=0,anzS=0,anzH=0;
        double gesPreis=0;
        while(derZeitTraglast<21){
            randomZahl=rnd.nextInt(3);
            if(randomZahl==1){
                randomZahl=rnd.nextInt(1001); // random Produkt aus dem warenlager
                randomZahl=randomZahl-1;
                while(warenlager[1][randomZahl]!=null){         //Durchgang ob produkt bereits gelöscht wurde
                    randomZahl=rnd.nextInt(1001);
                    randomZahl=randomZahl-1;
                }
                regal1.add(warenlager[1][randomZahl]);
                derZeitTraglast=derZeitTraglast+warenlager[1][randomZahl].gewicht; // Traglast erhöhen
                anzE++;  //Anzahl der Eletrowaren erhöhen
                gesPreis=gesPreis+warenlager[1][randomZahl].preis;      //Gesamtpreis erhöhen
                warenlager[1][randomZahl]=null;                         //aus dem warenlager löschen
            }
            else{
                if(randomZahl==2){
                    randomZahl=rnd.nextInt(1001); // random Produkt aus dem warenlager
                    randomZahl=randomZahl-1;
                    while(warenlager[1][randomZahl]!=null){         //Durchgang ob produkt bereits gelöscht wurde
                        randomZahl=rnd.nextInt(1001);
                        randomZahl=randomZahl-1;
                    }
                    regal1.add(warenlager[2][randomZahl]);
                    derZeitTraglast=derZeitTraglast+warenlager[2][randomZahl].gewicht; // Traglast erhöhen
                    anzS++;     //Anzahl der Spielwaren erhöhen
                    gesPreis=gesPreis+warenlager[2][randomZahl].preis;      //Gesamtpreis erhöhen
                    warenlager[1][randomZahl]=null;                         //aus dem warenlager löschen
                }
                else{
                    randomZahl=rnd.nextInt(1001); // random Produkt aus dem warenlager
                    randomZahl=randomZahl-1;
                    while(warenlager[1][randomZahl]!=null){             //Durchgang ob produkt bereits gelöscht wurde
                        randomZahl=rnd.nextInt(1001);
                        randomZahl=randomZahl-1;
                    }
                    regal1.add(warenlager[3][randomZahl]);
                    derZeitTraglast=derZeitTraglast+warenlager[3][randomZahl].gewicht; // Traglast erhöhen
                    anzH++;     //Anzahl der HAushaltsartikel erhöhen
                    gesPreis=gesPreis+warenlager[3][randomZahl].preis;      //Gesamtpreis erhöhen
                    warenlager[1][randomZahl]=null;                         //aus dem warenlager löschen
                }
            }
        }
        System.out.println("Elektrowaren:"+ anzE+" | Spielwaren:"+anzS+" | Haushaltsartikel:"+anzH+" | Gesamtpreis:"+ gesPreis );


    }
}

// Fehlt: Produkt aus dem warenlager[][] überprüfen ob sich ÜBERHAUPT ein produkt im Warenlager vorhanden ist
// 7 Regale befüllen oder solange man produkte im warenlager hat
// Preisänderung

//Persönlich: Es war ein fehler die Produkte in einem [][] zu speichen. Ich hätte es gleich in einer Liste machen sollen, um die Produkte einfach löschen zu können. Mir bleibt leider keine zeit um das zu ändern
//Ich weiß nämlich nicht wie man gescheit ein element aus einem array zu löscht.