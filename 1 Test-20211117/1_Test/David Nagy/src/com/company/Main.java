package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Waren [][]waren=new Waren[10][1000];
        Random rnd=new Random();


            for (int j = 0; j < 1000; j++) {
                int i=0;
                waren[i][j]=new Elektrowaren(rnd.nextInt((int)1498.0), rnd.nextInt((int)69.5),rnd.nextInt((int)2499.7));
                waren[i+1][j+1]=new Spielwaren(rnd.nextInt(1498), rnd.nextInt((int)69.5),rnd.nextInt(3) );
                waren[i+2][j+2]=new Haushaltsartikel(rnd.nextInt((int)1498.0), rnd.nextInt((int)69.5), rnd.nextBoolean());
            }
            rnd.nextInt((int)3.5);


        Waren [][]waren1=new Waren[10][1000];
        float traglast=0;
        float gesamtpreis=0;
        int i=0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 1000; k++) {
                while(i<7){
                    if(traglast<21000){
                        while(traglast<21000){

                            // for (int i = 0; i <3 ; i++) {
                            for (int l = 0; l < 1000; l++) {
                                int a = rnd.nextInt(3);
                                int b = rnd.nextInt(1000);

                                if(waren[a][b]!= null){
                                    waren1[i][l] = waren[a][b];
                                    //Abfrage ob Elektroware, wenn ja dann -10%
                                    //if(waren1[i][l].equals(Elektrowaren)){
                                      //      waren1[i][l].preis=  waren1[i][l].preis*0.99;
                                    //}
                                    waren[a][b] = null;
                                    traglast += waren1[i][l].gewicht;
                                    gesamtpreis += waren1[i][l].preis;
                                }
                            }
                        }
                    }else{
                        i++;
                        traglast=0;
                    }
                }
            }
        }

        //Überprüfung
        System.out.println("Anzahl der Elektrowaren im neuen Regal: "+waren1[0].length+" Anzahl der Spielwaren: "+waren1[1].length+ " Anzahl der HaushaltsA.: "+waren1[2].length);
        System.out.println("Gesamtpreis: "+gesamtpreis);


    }
}
