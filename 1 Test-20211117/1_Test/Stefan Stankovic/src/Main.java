import java.util.Random;

public class Main {
    public static Random rnd = new Random();

    public static void main(String[] args){
        String[] hersteller = {"Kids", "Freds", "Marvins"};
        String[] artDerWare = {"Elektroware","Spielware","Haushaltsartikel"};

        Regal[] regale = new Regal[10];
        Ware[] ewaren = new Elektroware[1000];
        Ware[] swaren = new Spielware[1000];
        Ware[] hartikel = new Haushaltsartikel[1000];

        for (int i = 0; i<1000; i++){
            ewaren[i] = new Elektroware("Elektroware", rnd.nextInt(1503) + 1,
                    rnd.nextInt(70) + 1, rnd.nextInt() + 1);
            swaren[i] = new Spielware("Spielware", rnd.nextInt(70) ,
                    rnd.nextInt(70), hersteller[rnd.nextInt(3)]);
            hartikel[i] = new Haushaltsartikel("Haushaltsartikel", rnd.nextInt(70) ,
                  rnd.nextInt(70), rnd.nextBoolean());
        }
        //Später in die eine "Simulationsklasse" einfügen
        while(true){

            Regal r;

            if (artDerWare[rnd.nextInt(3)].equals("Elektroware")){
                int gesamtgewicht = 0;
                Ware[] neuesRegal = new Elektroware[10000];
                while(gesamtgewicht <= 21000){
                    int jetztigeware = rnd.nextInt(1000);
                    Ware w = ewaren[jetztigeware];
                    ewaren[jetztigeware] = null;

                }
            }else if(artDerWare[rnd.nextInt(3)].equals("Spielware")){

            }else{

            }
        }

        /* Tut mir Leid Herr Prof. das war bestimmt traurig mitanzusehen wie ich dieses 2. Klasse Beispiel nicht
            hinbekomme. Dafür gibt es keine Ausrede, die diesen Umstand rechtfertigt. Ich bin in diesem Schuljahr
            irgendwie auf den falschen Fuß aufgestanden und das tut mir leid. Ich werde mein bestes geben um das
            in naher Zukunft zu ändern.

            Ein weiteres Mal, entschuldigung, dass sie dieses beispiel verbessern mussten.

            Mit freundlichen Grüßen,
            Stankovic Stefan
         */







    }
}
