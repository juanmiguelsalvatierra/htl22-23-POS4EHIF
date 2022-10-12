package com.company;

import javax.print.attribute.standard.PrinterURI;
import java.util.Random;

public class Warenlager {

    public Random rnd = new Random();
    public Warenlager(){

        Produkt[][] altesRegal = new Produkt[3][1000];

        for (int i = 0; i < 1000; i++) {
            altesRegal[0][i] = new Elektroware(rnd.nextInt(1498) + 2, (rnd.nextInt(695) + 5)/10, (rnd.nextInt(2497)+3)/10);
            altesRegal[1][i] = new Spielware(rnd.nextInt(1498) + 12, (rnd.nextInt(713) + 7)/100, returnRndString());
            altesRegal[2][i] = new Haushaltsartikel((rnd.nextInt(14980) + 18)/10, (rnd.nextInt(731) + 9)/10, rnd.nextBoolean());
        }

        befüllungDerNeuenRegale(altesRegal);
    }

    public String returnRndString(){
        int temp = rnd.nextInt(3);
        if(temp == 0){
            return "Kids";
        }
        else if(temp == 1){
            return "Freds";
        }
        else{
            return "Marvins";
        }
    }

    public void befüllungDerNeuenRegale(Produkt[][] tempRegal){

        Produkt[] neuesRegal = new Produkt[10000];

        int counterRegalAnz = 0;
        int counterGewicht = 0;
        int counterGesamtpreis = 0;
        int counterProdukteHinzugefügt = 0;

        int[] stats = {0, 0, 0};

        boolean found = false;
        int indexTempRegal = 0;
        int tempRnd = 0;

        while(counterRegalAnz < 7){

            //kann man vielleicht weglassen
            Produkt tempProdukt = null;

            while(found == false) {

                //zufälliges Produkt auswählen:
                indexTempRegal = rnd.nextInt(3);
                tempRnd = rnd.nextInt(1000);

                try {
                    //aus alten Regal rausnehmen
                    tempProdukt = tempRegal[indexTempRegal][tempRnd];
                    found = true;

                } catch (Exception e) {
                }
            }
                //& in neues einfügen:
                neuesRegal[counterProdukteHinzugefügt] = tempProdukt;

                //aus alten löschen
                tempRegal[indexTempRegal][tempRnd] = null;

                //counter erhöhen:
                counterGewicht += tempProdukt.gewicht;
                counterGesamtpreis += tempProdukt.preis;

                stats[indexTempRegal]++;
                counterProdukteHinzugefügt++;

                found = false;

            //ausgabe bei gewichtsüberschreitung
            if(counterGewicht > 21000){
                System.out.println("21 Tonnen wurden überschritten: " + counterGewicht+ ", Gesamtpreis: " + counterGesamtpreis);
                System.out.println("Anz-Elektrowaren:" + stats[0] + ", Anz-Spielwaren: " + stats[1] + ", Anz-Haushaltsartikel: " + stats[2]);

                //counter zurücksetzen
                counterGewicht = 0;
                counterGesamtpreis = 0;
                stats = new int[]{0, 0, 0};

                //neues Regal festlegen
                counterRegalAnz++;
            }

            //verlassen wenn keine produkte übrig
            if(returnAnzProdukte(tempRegal) == 0){
                return;
            }
        }
    }

    public int returnAnzProdukte(Produkt[][] temp){
        int tempCounter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < temp.length; j++) {
                if(temp[i][j] != null){
                    tempCounter++;
                }
            }
        }
        return tempCounter;
    }

    public void Preisänderung(Produkt[][] zuÄndern){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < zuÄndern.length; j++) {
                if(zuÄndern[i][j] instanceof Elektroware){
                    zuÄndern[i][j].preis = zuÄndern[i][j].preis*1.1;
                }
            }
        }
    }

}
