package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Regal[][] regal = new Regal[3][1000];
        Regal regal1 = null;
        int anzElectric = 0;
        int anzSports = 0;
        int anzHousehold = 0;
        Produkt thing = null;
        ElektroWaren elektroWaren = null;
        SportWaren sportWaren = null;
        HaushaltsWaren haushaltsWaren = null;
        int gesamtpreis = 0;

        for (int i = 0; i < regal.length; i++)
        {
            for (int j = 0; j < regal.length; j++) {
                while(regal1.traglast < 21000)
                {
                    if (thing.art == "ElektroWaren")
                    {
                        thing = new ElektroWaren();
                        anzElectric++;
                        gesamtpreis += elektroWaren.preis;
                        System.out.print("Anzahl der ElektoWaren: " + anzElectric + " /Preis " + gesamtpreis);
                    }
                    else
                    {
                        if (thing.art == "SportWaren")
                        {
                            thing = new SportWaren();
                            anzSports++;
                            gesamtpreis += sportWaren.preis;
                            System.out.print("Anzahl der ElektoWaren: " + anzSports + " /Preis " + gesamtpreis);
                        }
                        else
                        {
                            if (thing.art == "HaushaltsWaren")
                            {
                                thing = new HaushaltsWaren();
                                anzHousehold++;
                                gesamtpreis += haushaltsWaren.preis;
                                System.out.print("Anzahl der ElektoWaren: " + anzHousehold + "/Preis " + gesamtpreis);
                            }
                        }
                    }
                    System.out.println();
                }
                //System.out.println();
            }
        }

        //Ist Falsch gemacht worden was aber unten ist
        //for (int i = 0; i < regal.length; i++) {
        //    for (int j = 0; j < regal.length; j++) {

        //    }
        //}
    }
}
