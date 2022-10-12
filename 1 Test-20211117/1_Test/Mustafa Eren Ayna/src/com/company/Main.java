package com.company;
//Mustafa-Eren Ayna 4EHIF
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Regale [] regale = new Regale[3];

        //Elektrowaren [] elektrowaren = new Elektrowaren[1000];
        //Spielwaren [] spielwaren = new Spielwaren[1000];
        //Haushaltsartikel[] haushaltsartikel = new Haushaltsartikel[1000];


        Produkt [][]produkte = new Produkt[3][3000];
        Random rnd = new Random();

        //produkte erstellen
;       for (int i = 0;i < produkte.length ; i++){
            for (int j = 0 ; i < produkte[j].length;i++){
                if (i == 0){
                    produkte[i][j] = new Elektrowaren(rnd.nextInt(1498) + 2, rnd.nextInt((int) 69.5) + 0.5, rnd.nextInt((int)2499.7) + 0.3);
                }
                if(i == 1){
                    produkte[i][j] = new Spielwaren(rnd.nextInt(1498) + 12 , (rnd.nextInt((int) 69.5) + 0.7), "Kids");
                }
                if (i == 2){
                    produkte[i][j] = new Haushaltsartikel((int) (rnd.nextInt(1498) + 1.8), rnd.nextInt((int) 60.5) + 0.9 , rnd.nextBoolean() );

                }
            }
        }

        for (int i = 0; i < produkte.length; i++){
            for (int j = 0; j < produkte[i].length ; j++){
                System.out.println(produkte[i][j]);
            }
        }


    }
    //end main
    public void regalBefuellen(Produkt p1  , Regale regale[]){  //hier eigentlich produkt array mitgeben ....
        Random rnd = new Random();
        int gesamtgewicht = 0;

        //regale befüllen bis traglast erreicht ist
        for (int i = 0; i < regale.length; i++){

            if (i == 0){
                do {
                    regale[i].add(p1);
                    gesamtgewicht += p1.gewicht;
                }while(regale[i].traglast <= 21000);

            }
            if (i == 1) {
                do {
                    regale[i].add(p1);
                    gesamtgewicht += p1.gewicht;
                } while (regale[i].traglast <= 21000);

            }
            if (i == 2){
                do {
                    regale[i].add(p1);
                    gesamtgewicht += p1.gewicht;
                }while(regale[i].traglast <= 21000);

            }
            //Überprüfung ob traglast > 21000 => Anzahl der Produkte im jeweiligen Regal ausgeben
            if (regale[i].traglast >= 21000){

                int anzelektrowaren = 0;
                int anzspielwaren = 0;
                int anzhaushaltsartikel = 0;
                if (p1 instanceof Elektrowaren){
                    anzelektrowaren++;
                    System.out.println("Anzahl der Elektrowaren : "  + anzelektrowaren);
                    int gesamtpreis = p1.preis;
                    System.out.println("Gesamtpreis aller Elektrowaren : " + gesamtpreis);
                }
                if (p1 instanceof Spielwaren){
                    anzspielwaren++;
                    System.out.println("Anzahl der Spielwaren : "  + anzspielwaren);
                    int gesamtpreis = p1.preis;
                    System.out.println("Gesamtpreis aller Spielwaren : " + gesamtpreis);
                }
                if (p1 instanceof Haushaltsartikel){
                    anzhaushaltsartikel++;
                    System.out.println("Anzahl der Haushaltsartikel : "  + anzhaushaltsartikel);
                    int gesamtpreis = p1.preis;
                    System.out.println("Gesamtpreis aller Haushaltsartikel : " + gesamtpreis);
                }
            }
        }
    }

}
