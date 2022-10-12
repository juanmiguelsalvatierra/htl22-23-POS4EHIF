package com.company;

public class Main {

    static Lager[][] produkte = new Lager[3][1000];
    static int preis;
    static double gewicht;
    static double spezifikum;
    static Boolean bio;


    public static void main(String[] args) {

        int countgewicht = 0;
        int gespreis = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < produkte[0].length; j++){
                if(i == 0){
                    produkte[i][j] = new Lager();
                    produkte[i][j].add(new Elektrowaren("Elektrowaren", preis, gewicht, spezifikum));
                    countgewicht += gewicht;
                    gespreis += preis;

                    if(countgewicht >= 21000){
                        //produkte[0][10].toString();
                        System.out.println(produkte[0].length);
                        System.out.println("Gesamptpreis: " + gespreis);
                    }
                }

                gespreis = 0;
                if(i == 1){
                    produkte[i][j] = new Lager();
                    produkte[i][j].add(new Spielwaren("Spielwaren", preis, gewicht));
                    countgewicht += gewicht;
                    gespreis += preis;

                    if(countgewicht >= 21000){
                        //produkte[0][10].toString();
                        System.out.println(produkte[0].length);
                        System.out.println("Gesamptpreis: " + gespreis);
                    }
                }

                gespreis = 0;
                if(i == 2){
                    produkte[i][j] = new Lager();
                    produkte[i][j].add(new Haushaltsartikel("Haushaltsartikel", preis, gewicht, bio));
                    countgewicht += gewicht;
                    gespreis += preis;

                    if(countgewicht >= 21000){
                        //produkte[0][10].toString();
                        System.out.println(produkte[0].length);
                        System.out.println("Gesamptpreis: " + gespreis);
                    }
                }
            }
        }

        System.out.println(produkte[0][10].toString());
        System.out.println(produkte[1][10].toString());
        System.out.println(produkte[2][10].toString());
    }
}
