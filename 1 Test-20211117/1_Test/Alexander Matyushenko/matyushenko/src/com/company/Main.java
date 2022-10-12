package com.company;

import java.util.Random;

public class Main {
    static Regal r1 = new Regal("Elektrowaren Regal");
    static Regal r2 = new Regal("Spielwaren Regal");
    static Regal r3 = new Regal("Haushaltsartikel Regal");
    public static void main(String[] args) {
	// write your code here
        Random rn = new Random();
        //Regale anlegen


        for (int i = 0;i< 1000;i++){
            String art = "";
            boolean bia = false;
            switch (rn.nextInt(3)){
                case 1: art = "Kids";
                        bia = true;
                break;
                case 2: art = "Freds";
                break;
                case 3: art = "Marvins";
                break;
            }
            r1.add(new Elektroware(i,"e"+i+1,rn.nextDouble()*1498+2,rn.nextDouble()*69.5 + 0.5,rn.nextDouble()+2499.7+0.3));
            r2.add(new Spielware(i,"s"+i+1,rn.nextDouble()*14998+12,rn.nextDouble()*69.5+0.7,art));
            r3.add(new Haushaltsartikel(i,"h"+i+1,rn.nextDouble()*14998+1.8,rn.nextDouble()*69.5+0.9,bia));
        }
        r1.voll();
        r2.voll();
        r3.voll();
    }
    public static void einsortieren(){

        int anz=0;
        int id = 0;

        //!Nicht erweiterbar!
        Regal [] regals = new Regal[10];

        Random rnd = new Random();
        while(anz<=7 || (!r1.stellplatz && !r2.stellplatz && !r3.stellplatz)){
            regals[anz]= new Regal("r"+anz);
            while(regals[anz].gewicht < 21000){
                //Produkt aussuchen und aus der entsprechenden Tabelle entfernen
                switch (rnd.nextInt(3)){
                    case 1:
                        id = rnd.nextInt(1000);
                        regals[anz].add(r1.removeAndInsert(id));
                        break;
                    case 2:
                        id = rnd.nextInt(1000);
                        regals[anz].add(r2.removeAndInsert(id));
                        break;
                    case 3:
                        id = rnd.nextInt(1000);
                        regals[anz].add(r3.removeAndInsert(id));
                        break;
                }
            }
            System.out.println("Maximal gewicht von Regal"+regals[anz].bezeichnung+" erreicht");
            regals[anz].ausgeben();
            regals[anz].voll();
            anz++;

        }

    }
}
