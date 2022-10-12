import java.io.Console;
import java.lang.constant.Constable;
import java.util.Random;

public class Regal {

    public static Produkt root = null;

    public static void add(Produkt a){
        if(root == null){
            root = a;
            return;
        }
        //Vorne einfügen
        a.next = root;
        root = a;
    }

    public static void main(String[] args){

        Random rnd = new Random();
        Produkt[][] p = new Produkt[3][1000];


        for(int produkte = 0; produkte < 1000; produkte++){

            p[0][produkte] = new Elektrowaren(rnd.nextInt(1498) + 2, 0.5 + rnd.nextInt(70), rnd.nextInt(2500) + 0.3);
            p[1][produkte] = new Spielwaren(rnd.nextInt(1498) + 12, 0.7 + rnd.nextInt(70));
            p[2][produkte] = new Haushaltsartikel(1.8 + rnd.nextInt(1499), 0.9 + rnd.nextInt(70), rnd.nextBoolean());
        }

        //Umschlichten ins neuw Regal
        double anzGewicht = 0;
        int a, b;
        while(anzGewicht < 21000){

            if(p[a = rnd.nextInt(3)][b = rnd.nextInt(1000)] != null){
                add(p[a][b]);
                anzGewicht += p[a][b].gewicht;
                p[a][b] = null;
            }
        }

        System.out.println("Das Regal hat Produkte mit einem Gewicht von: " + anzGewicht);

    }


}
