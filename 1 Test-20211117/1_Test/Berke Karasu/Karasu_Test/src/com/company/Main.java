package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Ware[][] waren = new Ware[3][1000];

	    Random rn = new Random();

	    // Erstellen von den Waren
	    for (int i = 0; i < 1000; i++) {
            waren[0][i] = new Elektroware(rn.nextInt(1499 + 2), rn.nextDouble() * 69.5 + 0.5, rn.nextDouble() * 2499.7 + 0.3);

            int herstellerRnd = rn.nextInt(3);
            if (herstellerRnd == 0){
                waren[1][i] = new Spielware(rn.nextInt(1499) + 12, rn.nextDouble() * 69.5 + 0.7, "Kids");
            }else if (herstellerRnd == 1){
                waren[1][i] = new Spielware(rn.nextInt(1499) + 12, rn.nextDouble() * 70.2 + 0.7, "Freds");
            }else {
                waren[1][i] = new Spielware(rn.nextInt(1499) + 12, rn.nextDouble() * 70.2 + 0.7, "Marvins");
            }

            if (rn.nextInt(2) == 0){
                waren[2][i] = new Haushaltsartikel(rn.nextDouble() * 1498 + 1.8, rn.nextDouble() * 69.5 + 0.9, true);
            }else {
                waren[2][i] = new Haushaltsartikel(rn.nextDouble() * 1498 + 1.8, rn.nextDouble() * 69.5 + 0.9, false);
            }
        }

	    // Anlegen von 7 Regalen, weil es nicht mehr geben kann
        Regal[] regale = new Regal[7];
        for (int i = 0; i < 7; i++) {
            regale[i] = new Regal(i+1);
        }
        int regalVoll = 0;

        while (regalVoll < 7 || (waren[0] != null && waren[1] != null && waren[2] != null)){  // bricht ab, wenn Regale mehr als 7 oder alle Waren leer
            if (regale[regalVoll].gewicht > regale[regalVoll].maxTraglast){ // falls Regal mehr wiegt, Ausgabe und nächstes Regal
                // alte Idee
                /*System.out.printf("Regal %s\nElektrowaren: %s\nSpielwaren: %s\nHaushaltsartikel: %s\nGesamtpreis: %s",
                        regalVoll, regale[regalVoll].anzE, regale[regalVoll].anzS, regale[regalVoll].anzH,
                        regale[regalVoll].preis);*/
                System.out.println("Regal" + (regalVoll + 1));
                regale[regalVoll].anzahlAusgabe();
                regale[regalVoll].gesamtPreisAusgabe();
                System.out.println("-------------------------------------");
                regalVoll++;
            }else {
                int randomRegal = rn.nextInt(3);
                int randomArtikel = rn.nextInt(1000);
                while (waren[randomRegal][randomArtikel] == null){  // falls leer, neue Zeile und Spalte generieren
                    randomRegal = rn.nextInt(3);
                    randomArtikel = rn.nextInt(1000);
                }

                regale[regalVoll].add(waren[randomRegal][randomArtikel]);
                regale[regalVoll].gewicht += waren[randomRegal][randomArtikel].gewicht;
                waren[randomRegal][randomArtikel] = null;

                // alte Idee
               /* regale[regalVoll].gewicht += waren[randomRegal][randomArtikel].gewicht; // Gewicht addierend

                if (waren[randomRegal][randomArtikel] instanceof Elektroware){  // falls Ware Elektroware
                    regale[regalVoll].preis += waren[randomRegal][randomArtikel].preis * 0.9;
                }else {
                    regale[regalVoll].preis += waren[randomRegal][randomArtikel].preis;
                }

                if (waren[randomRegal][randomArtikel] instanceof Elektroware){
                    regale[regalVoll].anzE++;
                } else if (waren[randomRegal][randomArtikel] instanceof Spielware){
                    regale[regalVoll].anzS++;
                }else {
                    regale[regalVoll].anzH++;
                }
                waren[randomRegal][randomArtikel] = null;*/

            }
        }
    }
}
