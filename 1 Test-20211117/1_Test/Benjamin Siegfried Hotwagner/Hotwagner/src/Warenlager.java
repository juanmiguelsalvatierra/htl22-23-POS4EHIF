import java.util.Random;

public class Warenlager {
    public static void main(String[] args) {
        Random rnd = new Random();
        ProduktList[] neuenRegale = new ProduktList[3];
        ProduktList neuesRegal = new ProduktList();
        neuesRegal.max = 21000;
        Produkt[][] altenRegale = new Produkt[1000][3];

        for (int i = 0; i < altenRegale.length; i++) {//alten regale befüllen
            for (int j = 0; j < altenRegale[i].length; j++) {
                if (i == 0){
                    altenRegale[i][j] = new Elektroware((2 + rnd.nextDouble()*1498), (0.5+rnd.nextDouble()*68.5), (0.3 + rnd.nextDouble()*2499.07));
                }
                else if(i ==1){
                    altenRegale[i][j] = new Spielware((2 + rnd.nextDouble()*1498), (0.5+rnd.nextDouble()*68.5), "Hersteller1");
                }
                else {
                    altenRegale[i][j] = new Haushaltsartikel((2 + rnd.nextDouble()*1498), (0.5+rnd.nextDouble()*68.5), false);
                }
            }
        }
        //System.out.println(altenRegale[0][1]);        //test

        //Tests
        /*
        neuesRegal.add(new Elektroware(500, 2, 300));
        neuesRegal.add(new Elektroware(500, 3, 300));
        neuesRegal.add(new Elektroware(500, 4, 300));
        neuesRegal.print();*/


        //in neues regal umschlichten:
        for (int i = 0; i < altenRegale.length; i++) {
            for (int j = 0; j < altenRegale[i].length; j++) {
                if (neuesRegal.gewicht+altenRegale[i][j].gewicht<=neuesRegal.max){
                    neuesRegal.add(altenRegale[i][j]);
                }
            }
        }



        neuesRegal.print();
        System.out.println("neuesRegal.gewicht: " + neuesRegal.gewicht);
        System.out.println("artikel in neuem regal: " + neuesRegal.length);
        System.out.println("Gesamtpreis: " + neuesRegal.gesamtpreis +" € ");
    }
}
